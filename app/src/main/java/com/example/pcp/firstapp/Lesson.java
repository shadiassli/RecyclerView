package com.example.pcp.firstapp;

/**
 * Created by Pcp on 30/12/2016.
 */
public class Lesson {

        private  String Subject;
        private  String Title;
        private  String Date;

    public Lesson( String title,String subject, String date) {
        this.Subject = subject;
        this.Title = title;
        this.Date = date;
    }
        public String getSubject() {
            return Subject;
        }

        public void setSubject(String subject) {
            this.Subject = subject;
        }

        public String getTitle() {
            return Title;
        }

        public void setTitle(String title) {
            this.Title = title;
        }

        public String getDate() {
            return Date;
        }

        public void setDate(String date) {
            this.Date = date;
        }

        public Lesson() {
        }


    }

