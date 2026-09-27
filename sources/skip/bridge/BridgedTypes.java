package skip.bridge;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b%\b\u0086\u0081\u0002\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006&"}, d2 = {"Lskip/bridge/BridgedTypes;", "", "<init>", "(Ljava/lang/String;I)V", "boolean_", "byte_", "char_", "double_", "float_", "int_", "long_", "short_", "string_", "byteArray", AttributeType.DATE, Keys.KEY_FLOW, AttributeType.LIST, "locale", "map", AttributeType.NUMBER, Keys.KEY_SOCURE_RESULT, "set", "throwable", "uuid", "uri", "swiftArray", "swiftAsyncStream", "swiftAsyncThrowingStream", "swiftData", "swiftDate", "swiftDictionary", "swiftLocale", "swiftResult", "swiftSet", "swiftUUID", "swiftURL", "other", "Companion", "SkipBridge"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BridgedTypes {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ BridgedTypes[] $VALUES;
    public static final BridgedTypes boolean_ = new BridgedTypes("boolean_", 0);
    public static final BridgedTypes byte_ = new BridgedTypes("byte_", 1);
    public static final BridgedTypes char_ = new BridgedTypes("char_", 2);
    public static final BridgedTypes double_ = new BridgedTypes("double_", 3);
    public static final BridgedTypes float_ = new BridgedTypes("float_", 4);
    public static final BridgedTypes int_ = new BridgedTypes("int_", 5);
    public static final BridgedTypes long_ = new BridgedTypes("long_", 6);
    public static final BridgedTypes short_ = new BridgedTypes("short_", 7);
    public static final BridgedTypes string_ = new BridgedTypes("string_", 8);
    public static final BridgedTypes byteArray = new BridgedTypes("byteArray", 9);
    public static final BridgedTypes date = new BridgedTypes(AttributeType.DATE, 10);
    public static final BridgedTypes flow = new BridgedTypes(Keys.KEY_FLOW, 11);
    public static final BridgedTypes list = new BridgedTypes(AttributeType.LIST, 12);
    public static final BridgedTypes locale = new BridgedTypes("locale", 13);
    public static final BridgedTypes map = new BridgedTypes("map", 14);
    public static final BridgedTypes number = new BridgedTypes(AttributeType.NUMBER, 15);
    public static final BridgedTypes result = new BridgedTypes(Keys.KEY_SOCURE_RESULT, 16);
    public static final BridgedTypes set = new BridgedTypes("set", 17);
    public static final BridgedTypes throwable = new BridgedTypes("throwable", 18);
    public static final BridgedTypes uuid = new BridgedTypes("uuid", 19);
    public static final BridgedTypes uri = new BridgedTypes("uri", 20);
    public static final BridgedTypes swiftArray = new BridgedTypes("swiftArray", 21);
    public static final BridgedTypes swiftAsyncStream = new BridgedTypes("swiftAsyncStream", 22);
    public static final BridgedTypes swiftAsyncThrowingStream = new BridgedTypes("swiftAsyncThrowingStream", 23);
    public static final BridgedTypes swiftData = new BridgedTypes("swiftData", 24);
    public static final BridgedTypes swiftDate = new BridgedTypes("swiftDate", 25);
    public static final BridgedTypes swiftDictionary = new BridgedTypes("swiftDictionary", 26);
    public static final BridgedTypes swiftLocale = new BridgedTypes("swiftLocale", 27);
    public static final BridgedTypes swiftResult = new BridgedTypes("swiftResult", 28);
    public static final BridgedTypes swiftSet = new BridgedTypes("swiftSet", 29);
    public static final BridgedTypes swiftUUID = new BridgedTypes("swiftUUID", 30);
    public static final BridgedTypes swiftURL = new BridgedTypes("swiftURL", 31);
    public static final BridgedTypes other = new BridgedTypes("other", 32);

    private static final /* synthetic */ BridgedTypes[] $values() {
        return new BridgedTypes[]{boolean_, byte_, char_, double_, float_, int_, long_, short_, string_, byteArray, date, flow, list, locale, map, number, result, set, throwable, uuid, uri, swiftArray, swiftAsyncStream, swiftAsyncThrowingStream, swiftData, swiftDate, swiftDictionary, swiftLocale, swiftResult, swiftSet, swiftUUID, swiftURL, other};
    }

    static {
        BridgedTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private BridgedTypes(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static BridgedTypes valueOf(String str) {
        return (BridgedTypes) Enum.valueOf(BridgedTypes.class, str);
    }

    public static BridgedTypes[] values() {
        return (BridgedTypes[]) $VALUES.clone();
    }
}
