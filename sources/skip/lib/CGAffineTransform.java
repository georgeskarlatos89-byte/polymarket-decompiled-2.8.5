package skip.lib;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.idplus.device.internal.mediaDevice.manager.d;
import defpackage.lvf;
import defpackage.qvf;
import defpackage.ug7;
import defpackage.ww4;
import io.ably.lib.util.Log;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002JKB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B9\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\fB9\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\r\u0012\u0006\u0010\u0007\u001a\u00020\r\u0012\u0006\u0010\b\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\r\u0012\u0006\u0010\u000b\u001a\u00020\r¢\u0006\u0004\b\u0003\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0010B%\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0003\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0003\u0010\u0017B\u0011\b\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u0003\u0010\u001cJ\u000e\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0000J\u0006\u00100\u001a\u00020\u0000J\u000e\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0006J\u0016\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J\b\u0010D\u001a\u00020\u0002H\u0016J\u0013\u0010E\u001a\u00020,2\b\u0010F\u001a\u0004\u0018\u000108H\u0096\u0002J\u0010\u0010G\u001a\u0002092\u0006\u0010H\u001a\u00020IH\u0016R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0010R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001f\"\u0004\b\"\u0010\u0010R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010\u0010R$\u0010\t\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010\u0010R$\u0010\n\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010\u0010R$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010\u0010R\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b+\u0010-R(\u00106\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u000209\u0018\u000107X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020?X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006L"}, d2 = {"Lskip/lib/CGAffineTransform;", "Lskip/lib/Codable;", "Lskip/lib/MutableStruct;", "<init>", "()V", "a", "", "b", "c", d.d, "tx", "ty", "(DDDDDD)V", "", "(FFFFFF)V", "rotationAngle", "(D)V", "scaleX", "y", "unusedp_0", "", "(DDLjava/lang/Void;)V", "translationX", "(DD)V", "copy", "(Lskip/lib/MutableStruct;)V", TicketDetailDestinationKt.LAUNCHED_FROM, "Lskip/lib/Decoder;", "(Lskip/lib/Decoder;)V", "newValue", "getA", "()D", "setA", "getB", "setB", "getC", "setC", "getD", "setD", "getTx", "setTx", "getTy", "setTy", "isIdentity", "", "()Z", "concatenating", "transform", "inverted", "rotated", "by", "scaledBy", "x", "translatedBy", "supdate", "Lkotlin/Function1;", "", "", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "equals", "other", "encode", "to", "Lskip/lib/Encoder;", "CodingKeys", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CGAffineTransform implements Codable, MutableStruct {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CGAffineTransform identity = new CGAffineTransform();
    private double a;
    private double b;
    private double c;
    private double d;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;
    private double tx;
    private double ty;

    public CGAffineTransform(Decoder decoder) {
        decoder.getClass();
        this.a = 1.0d;
        this.d = 1.0d;
        qvf qvfVar = lvf.a;
        KeyedDecodingContainer container = decoder.container(qvfVar.getOrCreateKotlinClass(CodingKeys.class));
        Class cls = Double.TYPE;
        setA(container.mo1146decode(qvfVar.getOrCreateKotlinClass(cls), (CodingKey) CodingKeys.a));
        setB(container.mo1146decode(qvfVar.getOrCreateKotlinClass(cls), (CodingKey) CodingKeys.b));
        setC(container.mo1146decode(qvfVar.getOrCreateKotlinClass(cls), (CodingKey) CodingKeys.c));
        setD(container.mo1146decode(qvfVar.getOrCreateKotlinClass(cls), (CodingKey) CodingKeys.d));
        setTx(container.mo1146decode(qvfVar.getOrCreateKotlinClass(cls), (CodingKey) CodingKeys.tx));
        setTy(container.mo1146decode(qvfVar.getOrCreateKotlinClass(cls), (CodingKey) CodingKeys.ty));
    }

    public static final /* synthetic */ CGAffineTransform access$getIdentity$cp() {
        return identity;
    }

    public final CGAffineTransform concatenating(CGAffineTransform transform) {
        transform.getClass();
        CGAffineTransform cGAffineTransform = new CGAffineTransform();
        cGAffineTransform.setA((transform.b * this.c) + (transform.a * this.a));
        cGAffineTransform.setB((transform.b * this.d) + (transform.a * this.b));
        cGAffineTransform.setC((transform.d * this.c) + (transform.c * this.a));
        cGAffineTransform.setD((transform.d * this.d) + (transform.c * this.b));
        cGAffineTransform.setTx((transform.ty * this.c) + (transform.tx * this.a) + this.tx);
        cGAffineTransform.setTy((transform.ty * this.d) + (transform.tx * this.b) + this.ty);
        return (CGAffineTransform) StructKt.sref$default(cGAffineTransform, null, 1, null);
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    @Override // skip.lib.Encodable
    public void encode(Encoder to) {
        to.getClass();
        KeyedEncodingContainer container = to.container(lvf.a.getOrCreateKotlinClass(CodingKeys.class));
        container.encode(this.a, CodingKeys.a);
        container.encode(this.b, CodingKeys.b);
        container.encode(this.c, CodingKeys.c);
        container.encode(this.d, CodingKeys.d);
        container.encode(this.tx, CodingKeys.tx);
        container.encode(this.ty, CodingKeys.ty);
    }

    public boolean equals(Object other) {
        if (!(other instanceof CGAffineTransform)) {
            return false;
        }
        CGAffineTransform cGAffineTransform = (CGAffineTransform) other;
        if (this.a != cGAffineTransform.a || this.b != cGAffineTransform.b || this.c != cGAffineTransform.c || this.d != cGAffineTransform.d || this.tx != cGAffineTransform.tx || this.ty != cGAffineTransform.ty) {
            return false;
        }
        return true;
    }

    public final double getA() {
        return this.a;
    }

    public final double getB() {
        return this.b;
    }

    public final double getC() {
        return this.c;
    }

    public final double getD() {
        return this.d;
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final double getTx() {
        return this.tx;
    }

    public final double getTy() {
        return this.ty;
    }

    public final CGAffineTransform inverted() {
        double d = (this.a * this.d) - (this.c * this.b);
        if (d == ConstantsKt.UNSET) {
            return (CGAffineTransform) StructKt.sref$default(this, null, 1, null);
        }
        CGAffineTransform cGAffineTransform = new CGAffineTransform();
        cGAffineTransform.setA(this.d / d);
        cGAffineTransform.setB((-this.b) / d);
        cGAffineTransform.setC((-this.c) / d);
        cGAffineTransform.setD(this.a / d);
        cGAffineTransform.setTx(((this.c * this.ty) + ((-this.d) * this.tx)) / d);
        cGAffineTransform.setTy(((this.b * this.tx) - (this.a * this.ty)) / d);
        return (CGAffineTransform) StructKt.sref$default(cGAffineTransform, null, 1, null);
    }

    public final boolean isIdentity() {
        return Intrinsics.areEqual(this, identity);
    }

    public final CGAffineTransform rotated(double by) {
        return concatenating(new CGAffineTransform(by));
    }

    public final CGAffineTransform scaledBy(double x, double y) {
        return concatenating(new CGAffineTransform(x, y, null, 4, null));
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new CGAffineTransform(this);
    }

    public final void setA(double d) {
        willmutate();
        this.a = d;
        didmutate();
    }

    public final void setB(double d) {
        willmutate();
        this.b = d;
        didmutate();
    }

    public final void setC(double d) {
        willmutate();
        this.c = d;
        didmutate();
    }

    public final void setD(double d) {
        willmutate();
        this.d = d;
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

    public final void setTx(double d) {
        willmutate();
        this.tx = d;
        didmutate();
    }

    public final void setTy(double d) {
        willmutate();
        this.ty = d;
        didmutate();
    }

    public final CGAffineTransform translatedBy(double x, double y) {
        return concatenating(new CGAffineTransform(x, y));
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\f\b\u0082\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0001\u0012B\u001d\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lskip/lib/CGAffineTransform$CodingKeys;", "Lskip/lib/CodingKey;", "Lskip/lib/RawRepresentable;", "", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "a", "b", "c", d.d, "tx", "ty", "Companion", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CodingKeys implements CodingKey, RawRepresentable<String> {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ CodingKeys[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CodingKeys a = new CodingKeys("a", 0, "a", null, 2, null);
        public static final CodingKeys b = new CodingKeys("b", 1, "b", null, 2, null);
        public static final CodingKeys c = new CodingKeys("c", 2, "c", null, 2, null);
        public static final CodingKeys d = new CodingKeys(d.d, 3, d.d, null, 2, null);
        public static final CodingKeys tx = new CodingKeys("tx", 4, "tx", null, 2, null);
        public static final CodingKeys ty = new CodingKeys("ty", 5, "ty", null, 2, null);
        private final String rawValue;

        private static final /* synthetic */ CodingKeys[] $values() {
            return new CodingKeys[]{a, b, c, d, tx, ty};
        }

        static {
            CodingKeys[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ CodingKeys(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static CodingKeys valueOf(String str) {
            return (CodingKeys) Enum.valueOf(CodingKeys.class, str);
        }

        public static CodingKeys[] values() {
            return (CodingKeys[]) $VALUES.clone();
        }

        @Override // skip.lib.CodingKey, skip.lib.CustomDebugStringConvertible
        public String getDebugDescription() {
            return super.getDebugDescription();
        }

        @Override // skip.lib.CodingKey
        public String getDescription() {
            return super.getDescription();
        }

        @Override // skip.lib.CodingKey
        public Integer getIntValue() {
            return super.getIntValue();
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        @Override // skip.lib.CodingKey
        public String getStringValue() {
            return super.getStringValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lskip/lib/CGAffineTransform$CodingKeys$Companion;", "", "<init>", "()V", "init", "Lskip/lib/CGAffineTransform$CodingKeys;", "rawValue", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CodingKeys init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != 3716) {
                    if (hashCode != 3717) {
                        switch (hashCode) {
                            case 97:
                                if (rawValue.equals("a")) {
                                    return CodingKeys.a;
                                }
                                return null;
                            case 98:
                                if (rawValue.equals("b")) {
                                    return CodingKeys.b;
                                }
                                return null;
                            case Log.NONE /* 99 */:
                                if (rawValue.equals("c")) {
                                    return CodingKeys.c;
                                }
                                return null;
                            case 100:
                                if (rawValue.equals(d.d)) {
                                    return CodingKeys.d;
                                }
                                return null;
                            default:
                                return null;
                        }
                    }
                    if (rawValue.equals("ty")) {
                        return CodingKeys.ty;
                    }
                    return null;
                }
                if (!rawValue.equals("tx")) {
                    return null;
                }
                return CodingKeys.tx;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.CodingKey
        public String getRawValue() {
            return this.rawValue;
        }

        private CodingKeys(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lskip/lib/CGAffineTransform$Companion;", "Lskip/lib/DecodableCompanion;", "Lskip/lib/CGAffineTransform;", "<init>", "()V", "identity", "getIdentity", "()Lskip/lib/CGAffineTransform;", "init", TicketDetailDestinationKt.LAUNCHED_FROM, "Lskip/lib/Decoder;", "CodingKeys", "Lskip/lib/CGAffineTransform$CodingKeys;", "rawValue", "", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion implements DecodableCompanion<CGAffineTransform> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final CodingKeys CodingKeys(String rawValue) {
            return CodingKeys.INSTANCE.init(rawValue);
        }

        public final CGAffineTransform getIdentity() {
            return CGAffineTransform.access$getIdentity$cp();
        }

        @Override // skip.lib.DecodableCompanion
        /* renamed from: init, reason: avoid collision after fix types in other method */
        public CGAffineTransform init2(Decoder from) {
            from.getClass();
            return new CGAffineTransform(from);
        }

        private Companion() {
        }

        @Override // skip.lib.DecodableCompanion
        public /* bridge */ /* synthetic */ CGAffineTransform init(Decoder decoder) {
            return init2(decoder);
        }
    }

    public CGAffineTransform(double d, double d2, double d3, double d4, double d5, double d6) {
        this.a = 1.0d;
        this.d = 1.0d;
        setA(d);
        setB(d2);
        setC(d3);
        setD(d4);
        setTx(d5);
        setTy(d6);
    }

    public CGAffineTransform(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = 1.0d;
        this.d = 1.0d;
        setA(NumbersKt.Double(Float.valueOf(f)));
        setB(NumbersKt.Double(Float.valueOf(f2)));
        setC(NumbersKt.Double(Float.valueOf(f3)));
        setD(NumbersKt.Double(Float.valueOf(f4)));
        setTx(NumbersKt.Double(Float.valueOf(f5)));
        setTy(NumbersKt.Double(Float.valueOf(f6)));
    }

    public CGAffineTransform(double d) {
        this.a = 1.0d;
        this.d = 1.0d;
        double sin = MathKt.sin(d);
        double cos = MathKt.cos(d);
        setA(cos);
        setB(sin);
        setC(-sin);
        setD(cos);
    }

    public CGAffineTransform(double d, double d2, Void r7) {
        this.a = 1.0d;
        this.d = 1.0d;
        setA(d);
        setD(d2);
    }

    public /* synthetic */ CGAffineTransform(double d, double d2, Void r11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, (i & 4) != 0 ? null : r11);
    }

    public CGAffineTransform(double d, double d2) {
        this.a = 1.0d;
        this.d = 1.0d;
        setTx(d);
        setTy(d2);
    }

    private CGAffineTransform(MutableStruct mutableStruct) {
        this.a = 1.0d;
        this.d = 1.0d;
        mutableStruct.getClass();
        CGAffineTransform cGAffineTransform = (CGAffineTransform) mutableStruct;
        setA(cGAffineTransform.a);
        setB(cGAffineTransform.b);
        setC(cGAffineTransform.c);
        setD(cGAffineTransform.d);
        setTx(cGAffineTransform.tx);
        setTy(cGAffineTransform.ty);
    }

    public CGAffineTransform() {
        this.a = 1.0d;
        this.d = 1.0d;
    }
}
