package skip.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Hasher;
import skip.lib.RawRepresentable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lskip/foundation/FileAttributeKey;", "Lskip/lib/RawRepresentable;", "", "rawValue", "<init>", "(Ljava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileAttributeKey implements RawRepresentable<String> {
    private final String rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FileAttributeKey appendOnly = new FileAttributeKey("NSFileAppendOnly");
    private static final FileAttributeKey creationDate = new FileAttributeKey("NSFileCreationDate");
    private static final FileAttributeKey deviceIdentifier = new FileAttributeKey("NSFileDeviceIdentifier");
    private static final FileAttributeKey extensionHidden = new FileAttributeKey("NSFileExtensionHidden");
    private static final FileAttributeKey groupOwnerAccountID = new FileAttributeKey("NSFileGroupOwnerAccountID");
    private static final FileAttributeKey groupOwnerAccountName = new FileAttributeKey("NSFileGroupOwnerAccountName");
    private static final FileAttributeKey hfsCreatorCode = new FileAttributeKey("NSFileHFSCreatorCode");
    private static final FileAttributeKey hfsTypeCode = new FileAttributeKey("NSFileHFSTypeCode");
    private static final FileAttributeKey immutable = new FileAttributeKey("NSFileImmutable");
    private static final FileAttributeKey modificationDate = new FileAttributeKey("NSFileModificationDate");
    private static final FileAttributeKey ownerAccountID = new FileAttributeKey("NSFileOwnerAccountID");
    private static final FileAttributeKey ownerAccountName = new FileAttributeKey("NSFileOwnerAccountName");
    private static final FileAttributeKey posixPermissions = new FileAttributeKey("NSFilePosixPermissions");
    private static final FileAttributeKey protectionKey = new FileAttributeKey("NSFileProtectionKey");
    private static final FileAttributeKey referenceCount = new FileAttributeKey("NSFileReferenceCount");
    private static final FileAttributeKey systemFileNumber = new FileAttributeKey("NSFileSystemFileNumber");
    private static final FileAttributeKey systemFreeNodes = new FileAttributeKey("NSFileSystemFreeNodes");
    private static final FileAttributeKey systemFreeSize = new FileAttributeKey("NSFileSystemFreeSize");
    private static final FileAttributeKey systemNodes = new FileAttributeKey("NSFileSystemNodes");
    private static final FileAttributeKey systemNumber = new FileAttributeKey("NSFileSystemNumber");
    private static final FileAttributeKey systemSize = new FileAttributeKey("NSFileSystemSize");
    private static final FileAttributeKey type = new FileAttributeKey("NSFileType");
    private static final FileAttributeKey size = new FileAttributeKey("NSFileSize");
    private static final FileAttributeKey busy = new FileAttributeKey("NSFileBusy");

    public FileAttributeKey(String str) {
        str.getClass();
        this.rawValue = str;
    }

    public static final /* synthetic */ FileAttributeKey access$getAppendOnly$cp() {
        return appendOnly;
    }

    public static final /* synthetic */ FileAttributeKey access$getBusy$cp() {
        return busy;
    }

    public static final /* synthetic */ FileAttributeKey access$getCreationDate$cp() {
        return creationDate;
    }

    public static final /* synthetic */ FileAttributeKey access$getDeviceIdentifier$cp() {
        return deviceIdentifier;
    }

    public static final /* synthetic */ FileAttributeKey access$getExtensionHidden$cp() {
        return extensionHidden;
    }

    public static final /* synthetic */ FileAttributeKey access$getGroupOwnerAccountID$cp() {
        return groupOwnerAccountID;
    }

    public static final /* synthetic */ FileAttributeKey access$getGroupOwnerAccountName$cp() {
        return groupOwnerAccountName;
    }

    public static final /* synthetic */ FileAttributeKey access$getHfsCreatorCode$cp() {
        return hfsCreatorCode;
    }

    public static final /* synthetic */ FileAttributeKey access$getHfsTypeCode$cp() {
        return hfsTypeCode;
    }

    public static final /* synthetic */ FileAttributeKey access$getImmutable$cp() {
        return immutable;
    }

    public static final /* synthetic */ FileAttributeKey access$getModificationDate$cp() {
        return modificationDate;
    }

    public static final /* synthetic */ FileAttributeKey access$getOwnerAccountID$cp() {
        return ownerAccountID;
    }

    public static final /* synthetic */ FileAttributeKey access$getOwnerAccountName$cp() {
        return ownerAccountName;
    }

    public static final /* synthetic */ FileAttributeKey access$getPosixPermissions$cp() {
        return posixPermissions;
    }

    public static final /* synthetic */ FileAttributeKey access$getProtectionKey$cp() {
        return protectionKey;
    }

    public static final /* synthetic */ FileAttributeKey access$getReferenceCount$cp() {
        return referenceCount;
    }

    public static final /* synthetic */ FileAttributeKey access$getSize$cp() {
        return size;
    }

    public static final /* synthetic */ FileAttributeKey access$getSystemFileNumber$cp() {
        return systemFileNumber;
    }

    public static final /* synthetic */ FileAttributeKey access$getSystemFreeNodes$cp() {
        return systemFreeNodes;
    }

    public static final /* synthetic */ FileAttributeKey access$getSystemFreeSize$cp() {
        return systemFreeSize;
    }

    public static final /* synthetic */ FileAttributeKey access$getSystemNodes$cp() {
        return systemNodes;
    }

    public static final /* synthetic */ FileAttributeKey access$getSystemNumber$cp() {
        return systemNumber;
    }

    public static final /* synthetic */ FileAttributeKey access$getSystemSize$cp() {
        return systemSize;
    }

    public static final /* synthetic */ FileAttributeKey access$getType$cp() {
        return type;
    }

    public boolean equals(Object other) {
        if (!(other instanceof FileAttributeKey)) {
            return false;
        }
        return Intrinsics.areEqual(getRawValue(), ((FileAttributeKey) other).getRawValue());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    public int hashCode() {
        return Hasher.INSTANCE.combine(1, getRawValue());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b1\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0007R\u0011\u0010 \u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0011\u0010\"\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0011\u0010$\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0011\u0010&\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0007R\u0011\u0010(\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0011\u0010*\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u0011\u0010,\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0011\u0010.\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0011\u00100\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007R\u0011\u00102\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u0011\u00104\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007¨\u00066"}, d2 = {"Lskip/foundation/FileAttributeKey$Companion;", "", "<init>", "()V", "appendOnly", "Lskip/foundation/FileAttributeKey;", "getAppendOnly", "()Lskip/foundation/FileAttributeKey;", "creationDate", "getCreationDate", "deviceIdentifier", "getDeviceIdentifier", "extensionHidden", "getExtensionHidden", "groupOwnerAccountID", "getGroupOwnerAccountID", "groupOwnerAccountName", "getGroupOwnerAccountName", "hfsCreatorCode", "getHfsCreatorCode", "hfsTypeCode", "getHfsTypeCode", "immutable", "getImmutable", "modificationDate", "getModificationDate", "ownerAccountID", "getOwnerAccountID", "ownerAccountName", "getOwnerAccountName", "posixPermissions", "getPosixPermissions", "protectionKey", "getProtectionKey", "referenceCount", "getReferenceCount", "systemFileNumber", "getSystemFileNumber", "systemFreeNodes", "getSystemFreeNodes", "systemFreeSize", "getSystemFreeSize", "systemNodes", "getSystemNodes", "systemNumber", "getSystemNumber", "systemSize", "getSystemSize", "type", "getType", "size", "getSize", "busy", "getBusy", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FileAttributeKey getAppendOnly() {
            return FileAttributeKey.access$getAppendOnly$cp();
        }

        public final FileAttributeKey getBusy() {
            return FileAttributeKey.access$getBusy$cp();
        }

        public final FileAttributeKey getCreationDate() {
            return FileAttributeKey.access$getCreationDate$cp();
        }

        public final FileAttributeKey getDeviceIdentifier() {
            return FileAttributeKey.access$getDeviceIdentifier$cp();
        }

        public final FileAttributeKey getExtensionHidden() {
            return FileAttributeKey.access$getExtensionHidden$cp();
        }

        public final FileAttributeKey getGroupOwnerAccountID() {
            return FileAttributeKey.access$getGroupOwnerAccountID$cp();
        }

        public final FileAttributeKey getGroupOwnerAccountName() {
            return FileAttributeKey.access$getGroupOwnerAccountName$cp();
        }

        public final FileAttributeKey getHfsCreatorCode() {
            return FileAttributeKey.access$getHfsCreatorCode$cp();
        }

        public final FileAttributeKey getHfsTypeCode() {
            return FileAttributeKey.access$getHfsTypeCode$cp();
        }

        public final FileAttributeKey getImmutable() {
            return FileAttributeKey.access$getImmutable$cp();
        }

        public final FileAttributeKey getModificationDate() {
            return FileAttributeKey.access$getModificationDate$cp();
        }

        public final FileAttributeKey getOwnerAccountID() {
            return FileAttributeKey.access$getOwnerAccountID$cp();
        }

        public final FileAttributeKey getOwnerAccountName() {
            return FileAttributeKey.access$getOwnerAccountName$cp();
        }

        public final FileAttributeKey getPosixPermissions() {
            return FileAttributeKey.access$getPosixPermissions$cp();
        }

        public final FileAttributeKey getProtectionKey() {
            return FileAttributeKey.access$getProtectionKey$cp();
        }

        public final FileAttributeKey getReferenceCount() {
            return FileAttributeKey.access$getReferenceCount$cp();
        }

        public final FileAttributeKey getSize() {
            return FileAttributeKey.access$getSize$cp();
        }

        public final FileAttributeKey getSystemFileNumber() {
            return FileAttributeKey.access$getSystemFileNumber$cp();
        }

        public final FileAttributeKey getSystemFreeNodes() {
            return FileAttributeKey.access$getSystemFreeNodes$cp();
        }

        public final FileAttributeKey getSystemFreeSize() {
            return FileAttributeKey.access$getSystemFreeSize$cp();
        }

        public final FileAttributeKey getSystemNodes() {
            return FileAttributeKey.access$getSystemNodes$cp();
        }

        public final FileAttributeKey getSystemNumber() {
            return FileAttributeKey.access$getSystemNumber$cp();
        }

        public final FileAttributeKey getSystemSize() {
            return FileAttributeKey.access$getSystemSize$cp();
        }

        public final FileAttributeKey getType() {
            return FileAttributeKey.access$getType$cp();
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }
}
