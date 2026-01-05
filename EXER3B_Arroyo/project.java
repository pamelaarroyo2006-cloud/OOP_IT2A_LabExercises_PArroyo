public class EducationProgram {
    protected String programName;

    public EducationProgram(String programName) {
        this.programName = programName;
    }

    public void implement() {
        System.out.println(programName + " program is being implemented.");
    }
}

public class FormalEducation extends EducationProgram {
    public FormalEducation(String programName) {
        super(programName);
    }
    public void provideCurriculum() {
        System.out.println(programName + " provides a structured curriculum.");
    }
}

