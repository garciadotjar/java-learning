package p03_enums.domain;

public enum Days {

    //there are simpler ways to do this, but to study override abstract methods im doing with that
    SUNDAY(true){
        @Override
        public String IsWeekendMessage(){
            return ("Weekend");
        }
    },
    MONDAY(false){
        @Override
        public String IsWeekendMessage(){
            return ("Week day");
        }
    },
    TUESDAY(false){
        @Override
        public String IsWeekendMessage(){
            return ("Week day");
        }
    },
    WEDNESDAY(false){
        @Override
        public String IsWeekendMessage(){
            return ("Week day");
        }
    },
    THURSDAY(false){
        @Override
        public String IsWeekendMessage(){
            return ("Week day");
        }
    },
    FRIDAY(false){
        @Override
        public String IsWeekendMessage(){
            return ("Week day");
        }
    },
    SATURDAY(true){
        @Override
        public String IsWeekendMessage(){
            return ("Weekend");
        }
    };

    private final boolean weekend;

    Days(boolean weekend) {
        this.weekend = weekend;
    }

    public abstract String IsWeekendMessage();
}

