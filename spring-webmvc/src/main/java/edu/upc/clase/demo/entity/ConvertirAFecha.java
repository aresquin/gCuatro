/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Juan Yabiku
 */
public class ConvertirAFecha {
    public Date getFecha (String fecha) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        try {
            return df.parse(fecha);
        } catch (ParseException e) {
        }
        return null;
    }
}
