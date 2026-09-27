package skip.bridge;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007\u001a\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007\"\u0014\u0010\u0002\u001a\u00020\u0001X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0010"}, d2 = {"SwiftObjectPointer", "", "SwiftObjectNil", "getSwiftObjectNil", "()J", "Swift_peer", "of", "", "Swift_projection", "Lkotlin/Function0;", "options", "", "javaClassNameOf", "", "object_", "bridgedTypeStringOf", "SkipBridge"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BridgeSupportKt {
    private static final long SwiftObjectNil = 0;

    public static final long Swift_peer(Object obj) {
        SwiftPeerBridged swiftPeerBridged;
        obj.getClass();
        Long l = null;
        if (obj instanceof SwiftPeerBridged) {
            swiftPeerBridged = (SwiftPeerBridged) obj;
        } else {
            swiftPeerBridged = null;
        }
        if (swiftPeerBridged != null) {
            l = Long.valueOf(swiftPeerBridged.getSwift_peer());
        }
        if (l != null) {
            return l.longValue();
        }
        return SwiftObjectNil;
    }

    public static final Function0<Object> Swift_projection(Object obj, int i) {
        SwiftProjecting swiftProjecting;
        obj.getClass();
        if (obj instanceof SwiftProjecting) {
            swiftProjecting = (SwiftProjecting) obj;
        } else {
            swiftProjecting = null;
        }
        if (swiftProjecting == null) {
            return null;
        }
        return swiftProjecting.Swift_projection(i);
    }

    public static final String bridgedTypeStringOf(Object obj) {
        obj.getClass();
        return BridgedTypesKt.bridgedTypeOf(obj).name();
    }

    public static final long getSwiftObjectNil() {
        return SwiftObjectNil;
    }

    public static final String javaClassNameOf(Object obj) {
        obj.getClass();
        return obj.getClass().getName();
    }
}
