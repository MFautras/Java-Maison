/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionContratsTravail;


 
import classesMetier.ContratTravail;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Section;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import nezdames.serialisation.NezDamesSerialisation;
 

/**
 * Création d'un contrat de cession en PDF
 */
public class GenererPdfContratTravail {
 
  private String FILE;
  Date date = new java.util.Date();
  private static final Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
  private static final Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);
  private static final Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
  private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
  public static final String imageBanniere = "src/images/Titre.png";
  public static final String entete = "src/images/entete.png";
  
  private static ContratTravail leContrat;
  
  public GenererPdfContratTravail(int indiceDuContratTravailAEditer) {
    try {
      leContrat = NezDamesSerialisation.lesContratsTravail.get(indiceDuContratTravailAEditer);
      FILE = "ContratsTravail/ContratDeTravail-"+NezDamesSerialisation.lesContratsTravail.get(indiceDuContratTravailAEditer).getNumContratTravail()+".pdf";
      Document document = new Document();
      PdfWriter.getInstance(document, new FileOutputStream(FILE));
      document.open();
      ajoutContenu(document);
      document.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void ajoutContenu(Document document) throws DocumentException, BadElementException, IOException, ParseException {
 
    Chapter catPart = new Chapter(new Paragraph(/*contenu*/),1);
    catPart.add(Image.getInstance(entete));
    catPart.setNumberDepth(0); //on supprime la numerotation du titre du paragraphe
    
    //on formate la date du jour
    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    String date = format.format(new Date());

    
    Paragraph subPara = new Paragraph("Contrat de Travail à durée indéterminée", subFont);
    subPara.setAlignment(Element.ALIGN_CENTER);
    Section subCatPart = catPart.addSection(subPara,0); //on affiche le sous titre sans numérotation
    subCatPart.add(Image.getInstance(imageBanniere));
    subCatPart.add(new Paragraph(" ")); //on insère une ligne vide
    subCatPart.add(new Paragraph("Entre les soussignés, "));
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph("L'employeur : ", subFont));
    subCatPart.add(new Paragraph("Raison sociale de l'entreprise : Compagnie  NEZDAMES & NEZSIEURS")); 
    subCatPart.add(new Paragraph("Adresse complète : LES AIGLADINES      30140 MIALET"));
    subCatPart.add(new Paragraph("N° de SIRET :  491 378 766 000 27"));
    subCatPart.add(new Paragraph("APE ou code NAF     9001Z"));
    subCatPart.add(new Paragraph("Licence : 2-1034518"));
    subCatPart.add(new Paragraph("Représentée par son représentant légale : DUPREY NICOLAS en sa qualité de"));
    subCatPart.add(new Paragraph("PRESIDENT"));
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph("d'une part"));
    subCatPart.add(new Paragraph("et"));
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph("Le salarié : ", subFont));
    subCatPart.add(new Paragraph("Nom, prénom :"+ leContrat.getLintermittent().getNomIntermittent()+leContrat.getLintermittent().getPrenomIntermittent()));
    subCatPart.add(new Paragraph("Adresse : "+leContrat.getLintermittent().getAdresseRue()));
    subCatPart.add(new Paragraph("Adresse : "+leContrat.getLintermittent().getCodePostal()+leContrat.getLintermittent().getAdresseVille()));
    subCatPart.add(new Paragraph("Date et lieu de naissance : "+leContrat.getLintermittent().getDateNaissance()+" à "+leContrat.getLintermittent().getVilleNaissance()));
    subCatPart.add(new Paragraph("Nationalité : "+leContrat.getLintermittent().getNationalite()));
    subCatPart.add(new Paragraph("N°S.S / titre de travail : "+leContrat.getLintermittent().getNumeroInsee()));
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph("d'autre part,"));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph("il a été convenu et arrêté ce qui suit : "));
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph("Par le présent contrat de travail, l'employeur engage le salarié dans les conditions\n" +
"stipulées ci-après qui constituent les éléments essentiels de la relation de travail : "));
    subCatPart.add(new Paragraph(" "));
    subCatPart.add(new Paragraph("1. Motif :",subFont));
    subCatPart.add(new Paragraph("Emploi d'usage des secteurs du spectacle, de l'audiovisuel, de l'action culturelle et de\n" +
"la production cinématographique (Code du travail, art D.121-2)."));
      
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subCatPart.add(new Paragraph("2. Emploi :",subFont));
    subCatPart.add(new Paragraph("Le salarié est engagé en qualité de :"+leContrat.getRole()));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subCatPart.add(new Paragraph("3. Date d'effet :",subFont));
    subCatPart.add(new Paragraph("Le salarié est engagé à compter du :"+leContrat.getLeContratCession().getPremiereRepresentation()));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subCatPart.add(new Paragraph("4. Durée du contrat :",subFont));
    subCatPart.add(new Paragraph("Le salarié est engagé pour :"));
    subCatPart.add(new Paragraph("- le "+ leContrat.getLeContratCession().getLeSpectacleDuContratDeCession()));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));

    subCatPart.add(new Paragraph("5. Rémunération :",subFont));
    subCatPart.add(new Paragraph("L'employeur versera au salarié, indemnité de précarité comprise et à titre de\n"
            + "salaire brut, la somme de -135- euros minimum par cachet de représentation",smallBold));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subCatPart.add(new Paragraph("6. Lieu de travail :",subFont));
    subCatPart.add(new Paragraph("Le salarié pourra en principe être occupé à divers endroit."));
    subCatPart.add(new Paragraph("La(es) représentation(s) se déroulera(ont) le(s) :"));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subCatPart.add(new Paragraph("7. Nom et adresse de la caisse de retraite complémentaire :",subFont));
    subCatPart.add(new Paragraph("AUDIENS - 74, Rue Jean BLEUZEN - 92 177 VANVES cedex"));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subCatPart.add(new Paragraph("8. Adresse de l'URSSAF destinataire de la DPAE.* :",subFont));
    subCatPart.add(new Paragraph("16, rue du Cirque romain 30000 NIMES"));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subCatPart.add(new Paragraph("9. Durée du contrat :",subFont));
    subCatPart.add(new Paragraph("3226 - SYNDEAC"));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subCatPart.add(new Paragraph("10. Périodicité de versement de la rémunération, congés payés, délais\n"
            + "de préavis, durée normale du travail, conditions de travail :",subFont));
    subCatPart.add(new Paragraph("L'employeur et le salarié sont expressément convenus de se conformer aux\n"
            + "dispositions législatives, réglementaires, administratives et/ou statuaires et/ou aux\n"
            + "conventions collectives applicables régissant ces matières."));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subCatPart.add(new Paragraph("Fait en deux exemplaires originaux dont un remis à chacune des parties,\n"
            + "à Montpellier, le "+date));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));


    subCatPart.add(new Paragraph("Le Président                                                             Le Salarié"));
    subCatPart.add(new Paragraph("Nicolas DUPREY                                                           "+leContrat.getLintermittent().getPrenomIntermittent()+leContrat.getLintermittent().getNomIntermittent()));
    //on saute une ligne
    subCatPart.add(new Paragraph(" "));
    
    subCatPart.add(new Paragraph("* Conformément à la loi 78-17 du 06 janvier 1978, le salarié dispose d'un droit d'accès et de\n"
            + "rectification des données relatives à la Déclaration Préalable à l'embauche qui sont enregistrées dans le\n"
            + "fichier informatisé tenu par l'organisation"));
    
    document.add(catPart);

  }
    
 }  
