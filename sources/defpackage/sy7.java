package defpackage;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class sy7 {
    private static final /* synthetic */ sy7[] $VALUES;
    public static final sy7 IDENTITY;
    public static final sy7 LOWER_CASE_WITH_DASHES;
    public static final sy7 LOWER_CASE_WITH_DOTS;
    public static final sy7 LOWER_CASE_WITH_UNDERSCORES;
    public static final sy7 UPPER_CAMEL_CASE;
    public static final sy7 UPPER_CAMEL_CASE_WITH_SPACES;
    public static final sy7 UPPER_CASE_WITH_UNDERSCORES;

    static {
        sy7 sy7Var = new sy7() { // from class: ly7
            @Override // defpackage.sy7
            public final String b(Field field) {
                return field.getName();
            }
        };
        IDENTITY = sy7Var;
        sy7 sy7Var2 = new sy7() { // from class: my7
            @Override // defpackage.sy7
            public final String b(Field field) {
                return sy7.c(field.getName());
            }
        };
        UPPER_CAMEL_CASE = sy7Var2;
        sy7 sy7Var3 = new sy7() { // from class: ny7
            @Override // defpackage.sy7
            public final String b(Field field) {
                return sy7.c(sy7.a(field.getName(), ' '));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = sy7Var3;
        sy7 sy7Var4 = new sy7() { // from class: oy7
            @Override // defpackage.sy7
            public final String b(Field field) {
                return sy7.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        UPPER_CASE_WITH_UNDERSCORES = sy7Var4;
        sy7 sy7Var5 = new sy7() { // from class: py7
            @Override // defpackage.sy7
            public final String b(Field field) {
                return sy7.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = sy7Var5;
        sy7 sy7Var6 = new sy7() { // from class: qy7
            @Override // defpackage.sy7
            public final String b(Field field) {
                return sy7.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = sy7Var6;
        sy7 sy7Var7 = new sy7() { // from class: ry7
            @Override // defpackage.sy7
            public final String b(Field field) {
                return sy7.a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = sy7Var7;
        $VALUES = new sy7[]{sy7Var, sy7Var2, sy7Var3, sy7Var4, sy7Var5, sy7Var6, sy7Var7};
    }

    public static String a(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (!Character.isUpperCase(charAt)) {
                    char upperCase = Character.toUpperCase(charAt);
                    if (i == 0) {
                        return upperCase + str.substring(1);
                    }
                    return str.substring(0, i) + upperCase + str.substring(i + 1);
                }
            } else {
                i++;
            }
        }
        return str;
    }

    public static sy7 valueOf(String str) {
        return (sy7) Enum.valueOf(sy7.class, str);
    }

    public static sy7[] values() {
        return (sy7[]) $VALUES.clone();
    }

    public abstract String b(Field field);
}
