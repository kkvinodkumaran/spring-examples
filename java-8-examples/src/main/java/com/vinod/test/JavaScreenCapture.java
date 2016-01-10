package com.vinod.test;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.imageio.ImageIO;

public class JavaScreenCapture {

	public static void main(String... args) throws Exception {
		Robot robot = new Robot();
		Rectangle rect = new Rectangle(
				Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage bImage = robot.createScreenCapture(rect);
		String base64String = imgToBase64String(bImage, "png");
		System.out.println(base64String);
	}

	public static String imgToBase64String(final RenderedImage img,
			final String formatName) throws IOException {
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		ImageIO.write(img, formatName, Base64.getEncoder().wrap(os));
		return os.toString(StandardCharsets.ISO_8859_1.name());
	}
}
