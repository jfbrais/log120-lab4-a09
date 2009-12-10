package TP4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

//http://csourcesearch.net/java/fid5F9C874C7C239B9B3EF32D3E0DC3402281D6B75C.aspx?s=mdef%3Ainsert
//http://csourcesearch.net/java/fidAF96B0DE56932794C01E387C4178409A8A5479AD.aspx?s=mdef%3Ainsert
/**
 * Cette classe sert a Sérialiser les objet afin de les écrires sur le disque
 *
 */
public class Serializer
{	
	private String arg0 = "", arg1 = "", arg2 = "", arg3 = "";
	private JFileChooser jfcChooser = new JFileChooser();
	
	/**
	 * Constructeur.. crée un JFileChooser et lui applique les filtres
	 */
	public Serializer()
	{		
		jfcChooser.addChoosableFileFilter(new FileFilter()
		{

			@Override
			public boolean accept(File arg0)
			{
				boolean accept = arg0.isDirectory();
		        if (!accept)
		        {
		            String suffix = getSuffix(arg0);
		            if (suffix != null)
		            {
		                accept = suffix.equals("gab");
		            }
		        }
		        return accept;
			}

			@Override
			public String getDescription()
			{
				return "GAB module files (*.gab)";
			}
			
			private String getSuffix(File f) 
			{
		        String s = f.getPath(), suffix = null;
		        int i = s.lastIndexOf('.');
		        if (i > 0 && i < s.length() - 1)
		        {
		            suffix = s.substring(i + 1).toLowerCase();
		        }
		        return suffix;
		    }
		});
	}
	
	/**
	 * Séréalise un objet
	 */
	public void serialize()
	{
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try
		{
			int fileState = jfcChooser.showOpenDialog(null);
			File file = jfcChooser.getSelectedFile();
			if (file != null && fileState == JFileChooser.APPROVE_OPTION)
	        {
				fos = new FileOutputStream(file.getAbsolutePath()+".gab");
				out = new ObjectOutputStream(fos);
				out.writeObject(new Target());
				out.close();
	        }
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	/**
	 * Désérialise un objet
	 */
	public void unserialize()
	{
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try
		{
			int fileState = jfcChooser.showOpenDialog(null);
			File file = jfcChooser.getSelectedFile();
			if (file != null && fileState == JFileChooser.APPROVE_OPTION)
	        {
				fis = new FileInputStream(file.getAbsolutePath());
				in = new ObjectInputStream(fis);
				Target reOpen = (Target)in.readObject();
				in.close();
				
				arg0 = String.valueOf(reOpen.getX());
				arg1 = String.valueOf(reOpen.getY());
				arg2 = String.valueOf(reOpen.getZoom());
				arg3 = reOpen.getImage();
	        }
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
	
	/**
	 * Retourne la Valeur X de l'objet désérialiser
	 */
	public String getArg0()
	{
		return arg0;
	}
	
	/**
	 * Retourne la Valeur Y de l'objet désérialiser
	 */
	public String getArg1()
	{
		return arg1;
	}
	
	/**
	 *Retourne la Valeur du zoom de l'objet désérialiser
	 */
	public String getArg2()
	{
		return arg2;
	}
	
	/**
	 * Retourne la Valeur de l'image de l'objet désérialiser
	 */
	public String getArg3()
	{
		return arg3;
	}
}
