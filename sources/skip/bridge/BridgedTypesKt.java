package skip.bridge;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlinx.coroutines.flow.Flow;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"bridgedTypeOf", "Lskip/bridge/BridgedTypes;", "object_", "", "SkipBridge"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BridgedTypesKt {
    public static final BridgedTypes bridgedTypeOf(Object obj) {
        obj.getClass();
        if (obj instanceof SwiftProjecting) {
            return BridgedTypes.other;
        }
        if (obj instanceof Boolean) {
            return BridgedTypes.boolean_;
        }
        if (obj instanceof Byte) {
            return BridgedTypes.byte_;
        }
        if (obj instanceof Character) {
            return BridgedTypes.char_;
        }
        if (obj instanceof Double) {
            return BridgedTypes.double_;
        }
        if (obj instanceof Float) {
            return BridgedTypes.float_;
        }
        if (obj instanceof Integer) {
            return BridgedTypes.int_;
        }
        if (obj instanceof Long) {
            return BridgedTypes.long_;
        }
        if (obj instanceof Short) {
            return BridgedTypes.short_;
        }
        if (obj instanceof String) {
            return BridgedTypes.string_;
        }
        if (obj instanceof byte[]) {
            return BridgedTypes.byteArray;
        }
        if (obj instanceof Date) {
            return BridgedTypes.date;
        }
        if (obj instanceof Flow) {
            return BridgedTypes.flow;
        }
        if (obj instanceof List) {
            return BridgedTypes.list;
        }
        if (obj instanceof Locale) {
            return BridgedTypes.locale;
        }
        if (obj instanceof Map) {
            return BridgedTypes.map;
        }
        if (obj instanceof Number) {
            return BridgedTypes.number;
        }
        if (obj instanceof Result) {
            return BridgedTypes.result;
        }
        if (obj instanceof Set) {
            return BridgedTypes.set;
        }
        if (obj instanceof Throwable) {
            return BridgedTypes.throwable;
        }
        if (obj instanceof UUID) {
            return BridgedTypes.uuid;
        }
        if (obj instanceof URI) {
            return BridgedTypes.uri;
        }
        String name = obj.getClass().getName();
        switch (name.hashCode()) {
            case -1261603402:
                if (name.equals("skip.foundation.Data")) {
                    return BridgedTypes.swiftData;
                }
                break;
            case -1261603398:
                if (name.equals("skip.foundation.Date")) {
                    return BridgedTypes.swiftDate;
                }
                break;
            case -978632346:
                if (name.equals("skip.foundation.Locale")) {
                    return BridgedTypes.swiftLocale;
                }
                break;
            case -649258994:
                if (name.equals("skip.lib.Dictionary")) {
                    return BridgedTypes.swiftDictionary;
                }
                break;
            case -28329820:
                if (name.equals("skip.lib.AsyncStream")) {
                    return BridgedTypes.swiftAsyncStream;
                }
                break;
            case 321388513:
                if (name.equals("skip.lib.Array")) {
                    return BridgedTypes.swiftArray;
                }
                break;
            case 477274880:
                if (name.equals("skip.lib.AsyncThrowingStream")) {
                    return BridgedTypes.swiftAsyncThrowingStream;
                }
                break;
            case 1847847829:
                if (name.equals("skip.lib.Result")) {
                    return BridgedTypes.swiftResult;
                }
                break;
            case 1957891050:
                if (name.equals("skip.lib.Set")) {
                    return BridgedTypes.swiftSet;
                }
                break;
        }
        return BridgedTypes.other;
    }
}
