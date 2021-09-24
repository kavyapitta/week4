public enum PillowType {
    SLEEPING{
        @Override
        public String toString() {
            return "Sleeping";
        }
    },
    NECK{
        @Override
        public String toString() {
            return "Neck";
        }
    },
    STOMACH{
        @Override
        public String toString() {
            return "Stomach";
        }
    },
    BACK{
        @Override
        public String toString() {
            return "Back";
        }
    }
}
