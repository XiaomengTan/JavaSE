package Test039ExecptionClass;

public class Teacher {
    public void checkScore(int score) throws ScoreExecption{
        if(score<0||score>100){
            throw new ScoreExecption("ScoreOutOfBound");
        }else {
            System.out.println("分数正常");
        }
    }
}
