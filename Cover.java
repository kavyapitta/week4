public enum Cover{
    SOLID_COLOR{
        @Override
        public String toString() {
            return "Solid Color";
        }
    },
    MULTI_COLOR{
        @Override
        public String toString() {
            return "Multicolor";
        }
    },
    EMBROIDED{
        @Override
        public String toString() {
            return "Embroided";
        }
    } 
}
