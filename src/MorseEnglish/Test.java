package MorseEnglish;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test {

        @org.junit.jupiter.api.Test
        public void TestConvertTwoWordToMorse() {
            // Arrange
            Logic mH = new Logic();

            // Act
            String actual = mH.convertToMorK("test sos");
            String expected = "- * *** - / *** --- ***";

            // Assert
            assertEquals(expected, actual);
        }

        @org.junit.jupiter.api.Test
        public void TestConvertOneWordToEnglish() {
            // Arrange
            Logic mh = new Logic();

            // Act
            String actual = mh.convertToEnglish("**** * *--- *** *- -*");
            String expected = "hejsan";

            // Assert
            assertEquals(expected, actual);

        }

        @org.junit.jupiter.api.Test
        public void TestConvertNumbersToMorse() {
            // Arrange
            Logic mH = new Logic();

            // Act
            String actual = mH.convertToMorK("1994");
            String expected = "*---- ----* ----* ****-";

            // Assert
            assertEquals(expected, actual);


        }


    }

