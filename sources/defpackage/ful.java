package defpackage;

import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import java.util.Date;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class ful {
    public static final kjc a(kjc kjcVar, hg8 hg8Var) {
        return kjcVar.e(new ig8(hg8Var));
    }

    public static Enum b(Class cls, JsonReader jsonReader) {
        String c = c(jsonReader);
        try {
            return Enum.valueOf(cls, c);
        } catch (IllegalArgumentException unused) {
            throw new JsonParseException("unsupported value \"" + c + "\" for " + cls);
        }
    }

    public static String c(JsonReader jsonReader) {
        if (q69.a[jsonReader.peek().ordinal()] == 1) {
            return jsonReader.nextString();
        }
        throw new JsonParseException("expected string value");
    }

    public static String d(JsonReader jsonReader) {
        int i = q69.a[jsonReader.peek().ordinal()];
        if (i != 1) {
            if (i == 2) {
                jsonReader.nextNull();
                return null;
            }
            throw new JsonParseException("expected string value or null");
        }
        return jsonReader.nextString();
    }

    public static final String e(hhi hhiVar) {
        hhiVar.getClass();
        String str = hhiVar.a;
        int size = hhiVar.b.size();
        Date date = hhiVar.c;
        String str2 = hhiVar.d;
        Date date2 = hhiVar.e;
        StringBuilder q = m51.q("SyncState(userId='", str, "', activeChannelIds.size=", size, ", lastSyncedAt=");
        q.append(date);
        q.append(", rawLastSyncedAt=");
        q.append(str2);
        q.append(", markedAllReadAt=");
        return sv6.q(q, date2, ")");
    }
}
