package healthycoderapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void should_return_true_when_DietRecommended() {
        //given
        double weigth = 89.0;
        double height = 1.7;
        //when
        boolean recommended = BMICalculator.isDietRecommended(weigth, height);
        //then
        assertTrue(recommended);
    }

    @Test
    void should_ThrowArithmeticException_when_DietRecommended(){
        //given
        double weigth = 89.0;
        double height = 0.0;
        //when
        Executable executable = () -> BMICalculator.isDietRecommended(weigth,height);
        //then
        assertThrows(ArithmeticException.class, executable);

    }
    @Test
    void should_returncoderwithworstbmi_when_listnotempty(){
        //given
        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.80,68.8));
        coders.add(new Coder(1.82,98.8));
        coders.add(new Coder(1.82,64.7));

        //when
        Coder codersWorstBmi = BMICalculator.findCoderWithWorstBMI(coders);

        //then
        assertEquals(1.82,codersWorstBmi.getHeight());
        assertEquals(98.8,codersWorstBmi.getWeight());
    }
    @Test
    void should_returncoderwithworstbmi_when_listISempty(){
        //given
        List<Coder> coders = new ArrayList<>();


        //when
        Coder codersWorstBmi = BMICalculator.findCoderWithWorstBMI(coders);
        //then
        assertNull(codersWorstBmi);
    }
    @Test
    void should_returnCorrectBmiScoreArray_WhenCoderListIsNotEmpty(){
        //given
        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.80,60.0));
        coders.add(new Coder(1.82,98.0));
        coders.add(new Coder(1.82,64.7));
        double[] expected = {18.52,29.59,19.53};
        //when
        double[] bmiScores = BMICalculator.getBMIScores(coders);
        //then
        assertArrayEquals(expected,bmiScores);

    }

}