package com.company.lection8.homework;

import java.util.Scanner;

public class StudentBook {
        public static Scanner vvod = new Scanner(System.in);
        public AboutBook aboutBook;
        public String city;

        public StudentBook(){
            System.out.print("Введите фамилию студента: ");
            setStudentBook(vvod.next());
            aboutBook = new AboutBook();
        }
        public String getStudentBook(){
            return city;
        }
        public void setStudentBook(String city){
            this.city=city;
        }
        public class AboutBook {
            int sessions, xExams, andExams;
        public AboutBook(){
                System.out.print("Сессия №: ");
                setSessions(vvod.nextInt());
                System.out.print("Количество не сданных зачётов: ");
                setxExams(vvod.nextInt());
                System.out.print("Кол-во экзаменов на сл. сессию: ");
                setAndExams(vvod.nextInt());
            }
            public int getSessions(){
                return sessions;
            }
            public void setSessions(int sessions){
                this.sessions = sessions;
            }
            public int getxExams(){
                return xExams;
            }
            public void setxExams(int xExams){
                this.xExams = xExams;
            }
            public int getAndExams(){
                return andExams;
            }
            public void setAndExams(int andExams){
                this.andExams = andExams;
            }
            public void print(){
                System.out.print("Студент по фамилии"+getStudentBook()+" сдал "+ getSessions()+" сессию "+ getxExams()+" зачетов"+" и "+ getAndExams()+" экзаменов.");
            }
        }
        static public void main(String[]args){
            StudentBook ct=new StudentBook();
            ct.aboutBook.print();
        }
    }

