package com.development.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.development.model.SearchEngine;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Rectangle;
public class CreatePDF {
	
	private static Font TIME_ROMAN = new Font(Font.FontFamily.TIMES_ROMAN, 18,Font.BOLD);
	private static Font TIME_ROMAN_SMALL = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
	public static String name="shashi";
	/**
	 * @param args
	 */
	public static Document createPDF(String file,SearchEngine profileresult) {

		Document document = null;
		
		try {
			document = new Document();
			PdfWriter writer  = PdfWriter.getInstance(document, new FileOutputStream(file));
			Rectangle rect = new Rectangle(30, 30, 550, 800);
	        writer.setBoxSize("art", rect);
	        
			document.open();
			
			createTable(document,profileresult);

			document.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return document;

	}
	private static void createTable(Document document, SearchEngine profileresult) throws DocumentException {
		Paragraph paragraph = new Paragraph();
//		creteEmptyLine(paragraph, 2);
		document.add(paragraph);
		PdfPTable table = new PdfPTable(3);

		 PdfPTable tabHead = new PdfPTable(new float[] { 1F });
		    PdfPCell cell;
		    tabHead.setWidthPercentage(100);
		    cell = new PdfPCell(new Phrase("Header"));
		    tabHead.addCell(cell);
		    //tabHead.WriteSelectedRows(0, -1, 150, document.Top, writer.DirectContent);
		PdfPCell c1 = new PdfPCell(new Phrase("EMAIL"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase("First Name"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(c1);

		c1 = new PdfPCell(new Phrase("Last Name"));
		c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(c1);
		table.setHeaderRows(1);
		table.setWidthPercentage(70);
		
		
		for (int i = 0; i < 1; i++) {
			table.setWidthPercentage(100);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
			table.addCell(profileresult.getEmail()); 
			table.addCell(profileresult.getFirst_name());
			table.addCell(profileresult.getLast_name());
		}

		document.add(table);
	}

}