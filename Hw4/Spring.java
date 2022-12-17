package Hw4;


public enum Spring {
    ONE {
        public String toString() {
            return "Spring begin in 1 March.";
        }
    },

    TWO {
        public String toString() {
            return "Spring months: March, April, May.";
        }
    },

    THREE {
        public String toString() {
            return "Temp of air in Russia 15 degree.";
        }
    },

    FOUR {
        public String toString() {
            return "Average min temp 0 degree.";
        }
    },

    FIVE {
        public String toString() {
            return "Average max temp 15 degree.";
        }
    },

    SIX {
        public String toString() {
            return "21 March - vernel equinox.";
        }
    },

    SEVEN {
        public String toString() {
            return "1 May - Labor day. \n";
        }
    }
}
