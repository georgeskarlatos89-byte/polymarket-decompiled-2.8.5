package skip.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Hasher;
import skip.lib.RawRepresentable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lskip/foundation/FileAttributeType;", "Lskip/lib/RawRepresentable;", "", "rawValue", "<init>", "(Ljava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileAttributeType implements RawRepresentable<String> {
    private final String rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FileAttributeType typeDirectory = new FileAttributeType("NSFileTypeDirectory");
    private static final FileAttributeType typeRegular = new FileAttributeType("NSFileTypeRegular");
    private static final FileAttributeType typeSymbolicLink = new FileAttributeType("NSFileTypeSymbolicLink");
    private static final FileAttributeType typeSocket = new FileAttributeType("NSFileTypeSocket");
    private static final FileAttributeType typeCharacterSpecial = new FileAttributeType("NSFileTypeCharacterSpecial");
    private static final FileAttributeType typeBlockSpecial = new FileAttributeType("NSFileTypeBlockSpecial");
    private static final FileAttributeType typeUnknown = new FileAttributeType("NSFileTypeUnknown");

    public FileAttributeType(String str) {
        str.getClass();
        this.rawValue = str;
    }

    public static final /* synthetic */ FileAttributeType access$getTypeBlockSpecial$cp() {
        return typeBlockSpecial;
    }

    public static final /* synthetic */ FileAttributeType access$getTypeCharacterSpecial$cp() {
        return typeCharacterSpecial;
    }

    public static final /* synthetic */ FileAttributeType access$getTypeDirectory$cp() {
        return typeDirectory;
    }

    public static final /* synthetic */ FileAttributeType access$getTypeRegular$cp() {
        return typeRegular;
    }

    public static final /* synthetic */ FileAttributeType access$getTypeSocket$cp() {
        return typeSocket;
    }

    public static final /* synthetic */ FileAttributeType access$getTypeSymbolicLink$cp() {
        return typeSymbolicLink;
    }

    public static final /* synthetic */ FileAttributeType access$getTypeUnknown$cp() {
        return typeUnknown;
    }

    public boolean equals(Object other) {
        if (!(other instanceof FileAttributeType)) {
            return false;
        }
        return Intrinsics.areEqual(getRawValue(), ((FileAttributeType) other).getRawValue());
    }

    @Override // skip.lib.RawRepresentable
    public /* bridge */ /* synthetic */ String getRawValue() {
        return getRawValue();
    }

    public int hashCode() {
        return Hasher.INSTANCE.combine(1, getRawValue());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lskip/foundation/FileAttributeType$Companion;", "", "<init>", "()V", "typeDirectory", "Lskip/foundation/FileAttributeType;", "getTypeDirectory", "()Lskip/foundation/FileAttributeType;", "typeRegular", "getTypeRegular", "typeSymbolicLink", "getTypeSymbolicLink", "typeSocket", "getTypeSocket", "typeCharacterSpecial", "getTypeCharacterSpecial", "typeBlockSpecial", "getTypeBlockSpecial", "typeUnknown", "getTypeUnknown", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FileAttributeType getTypeBlockSpecial() {
            return FileAttributeType.access$getTypeBlockSpecial$cp();
        }

        public final FileAttributeType getTypeCharacterSpecial() {
            return FileAttributeType.access$getTypeCharacterSpecial$cp();
        }

        public final FileAttributeType getTypeDirectory() {
            return FileAttributeType.access$getTypeDirectory$cp();
        }

        public final FileAttributeType getTypeRegular() {
            return FileAttributeType.access$getTypeRegular$cp();
        }

        public final FileAttributeType getTypeSocket() {
            return FileAttributeType.access$getTypeSocket$cp();
        }

        public final FileAttributeType getTypeSymbolicLink() {
            return FileAttributeType.access$getTypeSymbolicLink$cp();
        }

        public final FileAttributeType getTypeUnknown() {
            return FileAttributeType.access$getTypeUnknown$cp();
        }

        private Companion() {
        }
    }

    @Override // skip.lib.RawRepresentable
    public String getRawValue() {
        return this.rawValue;
    }
}
