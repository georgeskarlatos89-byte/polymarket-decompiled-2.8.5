package defpackage;

import com.fingerprintjs.android.fpjs_pro.g;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qob {
    public final /* synthetic */ int a;
    public final wt2 b;

    public /* synthetic */ qob(wt2 wt2Var, int i) {
        this.a = i;
        this.b = wt2Var;
    }

    public final Object a(String str) {
        x65 x65Var;
        String str2;
        wt2 wt2Var = this.b;
        int i = this.a;
        switch (i) {
            case 0:
            default:
                try {
                    gwd gwdVar = wt2Var.c;
                    gwdVar.getClass();
                    switch (i) {
                        case 0:
                            x65Var = rob.c;
                            break;
                        default:
                            x65Var = erk.a;
                            break;
                    }
                    try {
                        return b(zvd.a(gwdVar, str, x65Var));
                    } catch (IllegalArgumentException e) {
                        String message = e.getMessage();
                        if (message == null) {
                            str2 = "The value parsed from '" + ((Object) str) + "' is invalid";
                        } else {
                            str2 = message + " (when parsing '" + ((Object) str) + "')";
                        }
                        throw new IllegalArgumentException(str2, e);
                    }
                } catch (wvd e2) {
                    throw new IllegalArgumentException("Failed to parse value from '" + ((Object) str) + '\'', e2);
                }
        }
    }

    public final Object b(x65 x65Var) {
        pob pobVar;
        switch (this.a) {
            case 0:
                et9 et9Var = (et9) x65Var;
                et9Var.getClass();
                gt9 gt9Var = et9Var.a;
                Integer num = gt9Var.a;
                erk.a(num, "year");
                int intValue = num.intValue();
                Integer num2 = et9Var.d;
                if (num2 == null) {
                    Integer num3 = gt9Var.b;
                    erk.a(num3, "monthNumber");
                    int intValue2 = num3.intValue();
                    Integer num4 = et9Var.b;
                    erk.a(num4, "day");
                    pobVar = new pob(intValue, intValue2, num4.intValue());
                } else {
                    pob pobVar2 = new pob(intValue, 1, 1);
                    int intValue3 = num2.intValue() - 1;
                    xv5.Companion.getClass();
                    sv5 sv5Var = xv5.a;
                    sv5Var.getClass();
                    long j = intValue3;
                    int i = sob.c;
                    try {
                        long addExact = Math.addExact(pobVar2.a.toEpochDay(), Math.multiplyExact(j, sv5Var.b));
                        long j2 = sob.a;
                        if (addExact <= sob.b && j2 <= addExact) {
                            LocalDate ofEpochDay = LocalDate.ofEpochDay(addExact);
                            ofEpochDay.getClass();
                            pob pobVar3 = new pob(ofEpochDay);
                            if (ofEpochDay.getYear() == intValue) {
                                if (gt9Var.b != null) {
                                    int b = khn.b(pobVar3.a());
                                    Integer num5 = gt9Var.b;
                                    if (num5 == null || b != num5.intValue()) {
                                        StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                                        sb.append(num2);
                                        sb.append(", which is ");
                                        sb.append(pobVar3.a());
                                        sb.append(", but ");
                                        throw new IllegalArgumentException(g.p(sb, gt9Var.b, " was specified as the month number"));
                                    }
                                }
                                if (et9Var.b != null) {
                                    int dayOfMonth = ofEpochDay.getDayOfMonth();
                                    Integer num6 = et9Var.b;
                                    if (num6 == null || dayOfMonth != num6.intValue()) {
                                        StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                                        sb2.append(num2);
                                        sb2.append(", which is the day ");
                                        sb2.append(ofEpochDay.getDayOfMonth());
                                        sb2.append(" of ");
                                        sb2.append(pobVar3.a());
                                        sb2.append(", but ");
                                        throw new IllegalArgumentException(g.p(sb2, et9Var.b, " was specified as the day of month"));
                                    }
                                }
                                pobVar = pobVar3;
                            } else {
                                throw new IllegalArgumentException("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + intValue);
                            }
                        } else {
                            throw new DateTimeException("The resulting day " + addExact + " is out of supported LocalDate range.");
                        }
                    } catch (Exception e) {
                        if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                            throw e;
                        }
                        throw new RuntimeException("The result of adding " + j + " of " + sv5Var + " to " + pobVar2 + " is out of LocalDate range.", e);
                    }
                }
                Integer num7 = et9Var.c;
                if (num7 != null) {
                    int intValue4 = num7.intValue();
                    LocalDate localDate = pobVar.a;
                    DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                    dayOfWeek.getClass();
                    fw5 fw5Var = (fw5) fw5.a().get(dayOfWeek.getValue() - 1);
                    fw5Var.getClass();
                    if (intValue4 != fw5Var.ordinal() + 1) {
                        StringBuilder sb3 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                        if (1 <= intValue4 && intValue4 < 8) {
                            sb3.append((fw5) fw5.a().get(intValue4 - 1));
                            sb3.append(" but the date is ");
                            sb3.append(pobVar);
                            sb3.append(", which is a ");
                            DayOfWeek dayOfWeek2 = localDate.getDayOfWeek();
                            dayOfWeek2.getClass();
                            sb3.append((fw5) fw5.a().get(dayOfWeek2.getValue() - 1));
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        f27.q(ace.f(intValue4, "Expected ISO day-of-week number in 1..7, got "));
                        return null;
                    }
                }
                return pobVar;
            default:
                gt9 gt9Var2 = (gt9) x65Var;
                gt9Var2.getClass();
                Integer num8 = gt9Var2.a;
                erk.a(num8, "year");
                int intValue5 = num8.intValue();
                Integer num9 = gt9Var2.b;
                erk.a(num9, "monthNumber");
                try {
                    YearMonth of = YearMonth.of(intValue5, num9.intValue());
                    of.getClass();
                    return new zqk(of);
                } catch (DateTimeException e2) {
                    xbc.s(e2);
                    return null;
                }
        }
    }
}
