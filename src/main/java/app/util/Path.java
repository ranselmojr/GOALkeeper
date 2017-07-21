package app.util;

import lombok.*;

public class Path {

    // The @Getter methods are needed in order to access
    // the variables from Velocity Templates
    //
    // Declare the actual routes here
    public static class Web {
        @Getter public static final String INDEX = "/";
        @Getter public static final String LOGIN = "/login/";
        @Getter public static final String LOGOUT = "/logout/";
        @Getter public static final String DASHBOARD = "/dashboard/";
        @Getter public static final String REGISTER = "/register/";
        @Getter public static final String FORGOT = "/forgot/";
        @Getter public static final String RESET = "/reset/:email/";

        @Getter public static final String LEARN = "/learning/learn/";
        @Getter public static final String QUESTION = "/learning/question/";
        @Getter public static final String FEEDBACK = "/feedback/";
        @Getter public static final String ABOUT = "/about/";



    }

    // Declare here the location of template files
    public static class Template {
        public final static String INDEX = "/template/helloworld.vm";
        public final static String LOGIN = "/template/login.vm";
        public final static String DASHBOARD = "/template/dashboard.vm";
        public final static String REGISTER = "/template/register.vm";
        public final static String FORGOT = "/template/forgot.vm";
        public final static String RESET = "/template/reset.vm";
        public final static String FEEDBACK = "/template/feedback.vm";
        public final static String ABOUT = "/template/dashboard.vm";

        public final static String LEARN = "/template/learning/learn.vm";
        public final static String QUESTION = "/template/learning/question.vm";

        public static final String NOT_FOUND = "/template/notFound.vm";
    }

}
