package skip.foundation;

import io.intercom.android.sdk.NotificationStatuses;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Hasher;
import skip.lib.RawRepresentable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lskip/foundation/FileProtectionType;", "Lskip/lib/RawRepresentable;", "", "rawValue", "<init>", "(Ljava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileProtectionType implements RawRepresentable<String> {
    private final String rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FileProtectionType none = new FileProtectionType("none");
    private static final FileProtectionType complete = new FileProtectionType(NotificationStatuses.COMPLETE_STATUS);
    private static final FileProtectionType completeUnlessOpen = new FileProtectionType("completeUnlessOpen");
    private static final FileProtectionType completeUntilFirstUserAuthentication = new FileProtectionType("completeUntilFirstUserAuthentication");
    private static final FileProtectionType completeWhenUserInactive = new FileProtectionType("completeWhenUserInactive");

    public FileProtectionType(String str) {
        str.getClass();
        this.rawValue = str;
    }

    public static final /* synthetic */ FileProtectionType access$getComplete$cp() {
        return complete;
    }

    public static final /* synthetic */ FileProtectionType access$getCompleteUnlessOpen$cp() {
        return completeUnlessOpen;
    }

    public static final /* synthetic */ FileProtectionType access$getCompleteUntilFirstUserAuthentication$cp() {
        return completeUntilFirstUserAuthentication;
    }

    public static final /* synthetic */ FileProtectionType access$getCompleteWhenUserInactive$cp() {
        return completeWhenUserInactive;
    }

    public static final /* synthetic */ FileProtectionType access$getNone$cp() {
        return none;
    }

    public boolean equals(Object other) {
        if (!(other instanceof FileProtectionType)) {
            return false;
        }
        return Intrinsics.areEqual(getRawValue(), ((FileProtectionType) other).getRawValue());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    public int hashCode() {
        return Hasher.INSTANCE.combine(1, getRawValue());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lskip/foundation/FileProtectionType$Companion;", "", "<init>", "()V", "none", "Lskip/foundation/FileProtectionType;", "getNone", "()Lskip/foundation/FileProtectionType;", NotificationStatuses.COMPLETE_STATUS, "getComplete", "completeUnlessOpen", "getCompleteUnlessOpen", "completeUntilFirstUserAuthentication", "getCompleteUntilFirstUserAuthentication", "completeWhenUserInactive", "getCompleteWhenUserInactive", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FileProtectionType getComplete() {
            return FileProtectionType.access$getComplete$cp();
        }

        public final FileProtectionType getCompleteUnlessOpen() {
            return FileProtectionType.access$getCompleteUnlessOpen$cp();
        }

        public final FileProtectionType getCompleteUntilFirstUserAuthentication() {
            return FileProtectionType.access$getCompleteUntilFirstUserAuthentication$cp();
        }

        public final FileProtectionType getCompleteWhenUserInactive() {
            return FileProtectionType.access$getCompleteWhenUserInactive$cp();
        }

        public final FileProtectionType getNone() {
            return FileProtectionType.access$getNone$cp();
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }
}
