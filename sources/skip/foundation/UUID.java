package skip.foundation;

import defpackage.alj;
import defpackage.hm6;
import defpackage.lvf;
import defpackage.m51;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import skip.lib.Codable;
import skip.lib.DecodableCompanion;
import skip.lib.Decoder;
import skip.lib.Encoder;
import skip.lib.Hasher;
import skip.lib.KotlinConverting;
import skip.lib.MutableStruct;
import skip.lib.NullReturnException;
import skip.lib.StructKt;
import skip.lib.SwiftCustomBridged;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u00019B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\fB\t\b\u0016¢\u0006\u0004\b\t\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0010B\u0011\b\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0011\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0000H\u0096\u0002J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)H\u0016J\b\u00105\u001a\u00020\u0006H\u0016J\b\u00106\u001a\u00020\bH\u0016J\u0013\u00107\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u00108\u001a\u00020%H\u0016R&\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00048@@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\fR\u001a\u0010\u001b\u001a\u00020\u001c8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010!R(\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0018\u0018\u00010+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020%X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006:"}, d2 = {"Lskip/foundation/UUID;", "", "Lskip/lib/Codable;", "Lskip/lib/KotlinConverting;", "Ljava/util/UUID;", "Lskip/lib/SwiftCustomBridged;", "Lskip/lib/MutableStruct;", "uuidString", "", "<init>", "(Ljava/lang/String;)V", "platformValue", "(Ljava/util/UUID;)V", "()V", TicketDetailDestinationKt.LAUNCHED_FROM, "Lskip/lib/Decoder;", "(Lskip/lib/Decoder;)V", "copy", "(Lskip/lib/MutableStruct;)V", "newValue", "getPlatformValue$SkipFoundation", "()Ljava/util/UUID;", "setPlatformValue$SkipFoundation", "encode", "", "to", "Lskip/lib/Encoder;", "uuid", "", "getUuid$annotations", "getUuid", "()Ljava/lang/Object;", "getUuidString", "()Ljava/lang/String;", "description", "getDescription", "compareTo", "", "other", "kotlin", "nocopy", "", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "toString", "equals", "hashCode", "Companion", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UUID implements Comparable<UUID>, Codable, KotlinConverting<java.util.UUID>, SwiftCustomBridged, MutableStruct {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private java.util.UUID platformValue;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    public UUID(Decoder decoder) {
        decoder.getClass();
        java.util.UUID fromString = java.util.UUID.fromString(decoder.singleValueContainer().mo1183decode((KClass<String>) lvf.a.getOrCreateKotlinClass(String.class)));
        fromString.getClass();
        setPlatformValue$SkipFoundation(fromString);
    }

    private static final Unit _get_platformValue_$lambda$0(UUID uuid, java.util.UUID uuid2) {
        uuid2.getClass();
        uuid.setPlatformValue$SkipFoundation(uuid2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(UUID uuid, java.util.UUID uuid2) {
        return _get_platformValue_$lambda$0(uuid, uuid2);
    }

    private static final boolean compareTo$islessthan(UUID uuid, UUID uuid2) {
        if (uuid.getPlatformValue$SkipFoundation().compareTo(uuid2.getPlatformValue$SkipFoundation()) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(UUID other) {
        other.getClass();
        if (Intrinsics.areEqual(this, other)) {
            return 0;
        }
        if (compareTo$islessthan(this, other)) {
            return -1;
        }
        return 1;
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    @Override // skip.lib.Encodable
    public void encode(Encoder to) {
        to.getClass();
        to.singleValueContainer().encode(getUuidString());
    }

    public boolean equals(Object other) {
        if (!(other instanceof UUID)) {
            return false;
        }
        return Intrinsics.areEqual(getPlatformValue$SkipFoundation(), ((UUID) other).getPlatformValue$SkipFoundation());
    }

    public final String getDescription() {
        return getUuidString();
    }

    public final java.util.UUID getPlatformValue$SkipFoundation() {
        return (java.util.UUID) StructKt.sref(this.platformValue, new alj(this, 14));
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final Object getUuid() {
        throw m51.d(null, 1, null);
    }

    public final String getUuidString() {
        String uuid = getPlatformValue$SkipFoundation().toString();
        uuid.getClass();
        String upperCase = uuid.toUpperCase(java.util.Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }

    public int hashCode() {
        return Hasher.INSTANCE.combine(1, getPlatformValue$SkipFoundation());
    }

    @Override // skip.lib.KotlinConverting
    /* renamed from: kotlin, reason: avoid collision after fix types in other method */
    public java.util.UUID kotlin2(boolean nocopy) {
        return (java.util.UUID) StructKt.sref$default(getPlatformValue$SkipFoundation(), null, 1, null);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new UUID(this);
    }

    public final void setPlatformValue$SkipFoundation(java.util.UUID uuid) {
        uuid.getClass();
        java.util.UUID uuid2 = (java.util.UUID) StructKt.sref$default(uuid, null, 1, null);
        willmutate();
        this.platformValue = uuid2;
        didmutate();
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public String toString() {
        return getDescription();
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lskip/foundation/UUID$Companion;", "Lskip/lib/DecodableCompanion;", "Lskip/foundation/UUID;", "<init>", "()V", "fromString", "uuidString", "", "init", TicketDetailDestinationKt.LAUNCHED_FROM, "Lskip/lib/Decoder;", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion implements DecodableCompanion<UUID> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UUID fromString(String uuidString) {
            uuidString.getClass();
            try {
                java.util.UUID fromString = java.util.UUID.fromString(uuidString);
                fromString.getClass();
                return new UUID(fromString);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // skip.lib.DecodableCompanion
        /* renamed from: init, reason: avoid collision after fix types in other method */
        public UUID init2(Decoder from) {
            from.getClass();
            return new UUID(from);
        }

        private Companion() {
        }

        @Override // skip.lib.DecodableCompanion
        public /* bridge */ /* synthetic */ UUID init(Decoder decoder) {
            return init2(decoder);
        }
    }

    @Override // skip.lib.KotlinConverting
    public /* bridge */ /* synthetic */ java.util.UUID kotlin(boolean z) {
        return kotlin2(z);
    }

    @hm6
    public static /* synthetic */ void getUuid$annotations() {
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UUID uuid) {
        return compareTo2(uuid);
    }

    public UUID(java.util.UUID uuid) {
        uuid.getClass();
        setPlatformValue$SkipFoundation(uuid);
    }

    public UUID() {
        java.util.UUID randomUUID = java.util.UUID.randomUUID();
        randomUUID.getClass();
        setPlatformValue$SkipFoundation(randomUUID);
    }

    public UUID(String str) {
        java.util.UUID uuid;
        str.getClass();
        try {
            uuid = java.util.UUID.fromString(str);
        } catch (Throwable unused) {
            uuid = null;
        }
        if (uuid != null) {
            setPlatformValue$SkipFoundation(uuid);
            return;
        }
        throw new NullReturnException();
    }

    private UUID(MutableStruct mutableStruct) {
        mutableStruct.getClass();
        setPlatformValue$SkipFoundation(((UUID) mutableStruct).getPlatformValue$SkipFoundation());
    }
}
