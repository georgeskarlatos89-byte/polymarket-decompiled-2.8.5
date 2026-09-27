package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class od9 {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(od9.class.getResourceAsStream("/org/commonmark/internal/util/entities.txt"), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (!readLine.isEmpty()) {
                            int indexOf = readLine.indexOf("=");
                            hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                        }
                    } else {
                        bufferedReader.close();
                        hashMap.put("NewLine", "\n");
                        a = hashMap;
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException e) {
            fi9.n("Failed reading data for HTML named character references", e);
        }
    }

    public static String a(String str) {
        int i;
        if (str.startsWith("&") && str.endsWith(";")) {
            String k = woa.k(1, 1, str);
            if (k.startsWith("#")) {
                String substring = k.substring(1);
                if (!substring.startsWith("x") && !substring.startsWith("X")) {
                    i = 10;
                } else {
                    substring = substring.substring(1);
                    i = 16;
                }
                try {
                    int parseInt = Integer.parseInt(substring, i);
                    if (parseInt != 0) {
                        return new String(Character.toChars(parseInt));
                    }
                    return "�";
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = (String) a.get(k);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }
}
