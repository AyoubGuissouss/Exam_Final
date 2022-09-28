/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Ayoub
 */
public class FileTypeFIlter extends FileFilter{
    
    private final String extension;
    private final String description;

    public FileTypeFIlter(String extension, String description) {
        this.extension = extension;
        this.description = description;
    }
        
    
    @Override
    public boolean accept(File f) {
        if(f.isDirectory()){
            return true;
        }
        return f.getName().endsWith(extension);
    }

    @Override
    public String getDescription() {
        return description + String.format(" (*%s)", extension);
    }
    
}