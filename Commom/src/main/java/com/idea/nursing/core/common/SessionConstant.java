package com.idea.nursing.core.common;

public class SessionConstant {

    public static final String	SESSION_USER_BEAN	= "userBean";

    public enum PictureType{
        STAFFHEAD((byte)1),
        SERVICEPICTURE((byte)2);
        public final byte key;
        PictureType(byte key){
            this.key = key;
        }

    }




}