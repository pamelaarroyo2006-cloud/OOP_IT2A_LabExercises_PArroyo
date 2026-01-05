public class EducationTester {
    public static void main(String[] args) {
        PrimarySchool primary = new PrimarySchool();
        SecondarySchool secondary = new SecondarySchool();
        HigherEducation higher = new HigherEducation();
        OnlineLearning online = new OnlineLearning();
        VocationalTraining vocational = new VocationalTraining();
        AdultEducation adult = new AdultEducation();

        // Test Formal Education
        primary.implement();
        primary.provideCurriculum();

        secondary.implement();
        secondary.provideCurriculum();

        higher.implement();
        higher.provideCurriculum();

        // Test Non-Formal Education
        online.implement();
        online.supportLifelongLearning();

        vocational.implement();
        vocational.supportLifelongLearning();

        adult.implement();
        adult.supportLifelongLearning();
    }
}
