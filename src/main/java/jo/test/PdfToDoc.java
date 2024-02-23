package jo.test;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Date:2024/2/23
 * Author:Jo
 * Description:PDF to DOC
 */
public class PdfToDoc {
    public static void main(String[] args) {
        try {
            // 加载PDF文件
            PDDocument document = PDDocument.load(new FileInputStream("/Users/yinxiaoqiao/Desktop/简历/殷小乔_Java后端开发工程师.pdf"));

            // 创建一个空的DOC文档
            XWPFDocument doc = new XWPFDocument();

            // 创建PDF渲染器
            PDFRenderer renderer = new PDFRenderer(document);

            // 遍历PDF页面并将内容复制到DOC文档中
            for (int i = 0; i < document.getNumberOfPages(); i++) {
                // 创建新段落
                XWPFParagraph paragraph = doc.createParagraph();
                XWPFRun run = paragraph.createRun();

                // 获取PDF页面的文本内容
                PDFTextStripper stripper = new PDFTextStripper();
                stripper.setStartPage(i + 1);
                stripper.setEndPage(i + 1);
                String text = stripper.getText(document);

                // 将文本内容添加到DOC文档中
                run.setText(text);
                // 获取PDF页面的图片并插入到DOC文档中
                BufferedImage image = renderer.renderImageWithDPI(i, 300); // 设置图像的DPI
                String imagePath = "image" + i + ".png"; // 图片保存路径
                FileOutputStream imageOut = new FileOutputStream(imagePath);
                javax.imageio.ImageIO.write(image, "png", imageOut);
                imageOut.close();

                // 插入图片到DOC文档中
                run.addBreak();
                run.addPicture(new FileInputStream(imagePath), XWPFDocument.PICTURE_TYPE_PNG, imagePath, 600, 400); // 设置图片宽度和高度

            }

            // 保存DOC文档到文件
            FileOutputStream out = new FileOutputStream("/Users/yinxiaoqiao/Desktop/简历/Java后端开发工程师1.docx");
            doc.write(out);
            out.close();

            // 关闭PDF文档
            document.close();

            System.out.println("转换完成！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
