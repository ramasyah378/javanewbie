/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setter_getter;

/**
 *
 * @author hp
 */
public class GradeBook {
    private String courseName;
    public GradeBook(String name){
        courseName = name; }
    
    public void setCourseName(String name){
        courseName = name; }
    
    public String getCourseName(){
        return courseName; }
    
    public void displayMessage() {
        System.out.printf("Welcome at java class \n%s!\n", getCourseName()); }
}




