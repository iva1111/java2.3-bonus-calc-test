import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, true);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_000_60;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, true);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, true);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, true);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}