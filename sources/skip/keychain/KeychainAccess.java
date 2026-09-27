package skip.keychain;

import defpackage.ug7;
import defpackage.ww4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0082 j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0011"}, d2 = {"Lskip/keychain/KeychainAccess;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "unlocked", "unlockedThisDeviceOnly", "firstUnlock", "firstUnlockThisDeviceOnly", "passcodeSetThisDeviceOnly", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "SkipKeychain"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KeychainAccess implements SwiftProjecting {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ KeychainAccess[] $VALUES;
    public static final KeychainAccess unlocked = new KeychainAccess("unlocked", 0);
    public static final KeychainAccess unlockedThisDeviceOnly = new KeychainAccess("unlockedThisDeviceOnly", 1);
    public static final KeychainAccess firstUnlock = new KeychainAccess("firstUnlock", 2);
    public static final KeychainAccess firstUnlockThisDeviceOnly = new KeychainAccess("firstUnlockThisDeviceOnly", 3);
    public static final KeychainAccess passcodeSetThisDeviceOnly = new KeychainAccess("passcodeSetThisDeviceOnly", 4);

    private static final /* synthetic */ KeychainAccess[] $values() {
        return new KeychainAccess[]{unlocked, unlockedThisDeviceOnly, firstUnlock, firstUnlockThisDeviceOnly, passcodeSetThisDeviceOnly};
    }

    static {
        KeychainAccess[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private KeychainAccess(String str, int i) {
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static KeychainAccess valueOf(String str) {
        return (KeychainAccess) Enum.valueOf(KeychainAccess.class, str);
    }

    public static KeychainAccess[] values() {
        return (KeychainAccess[]) $VALUES.clone();
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }
}
