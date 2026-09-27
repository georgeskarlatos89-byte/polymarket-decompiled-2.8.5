package com.polymarket.data;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.socure.docv.capturesdk.common.utils.BlurConstants;
import defpackage.pc0;
import defpackage.qc0;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.models.AttributeType;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.util.RadarSimpleLogBuffer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.Hasher;
import skip.lib.Identifiable;
import skip.lib.InOut;
import skip.lib.MutableStruct;
import skip.lib.RawRepresentable;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 j2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0003hijB\u001f\b\u0016\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0012\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0015\u0010\u0015\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\f\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0015\u0010\u001c\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010\u001d\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0082 J\u0015\u0010\"\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010#\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0082 J\u0015\u0010*\u001a\u00020$2\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010+\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u001e\u001a\u00020$H\u0082 J\u0015\u0010/\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u00100\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0082 J\u0015\u00104\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u00105\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0082 J\u001b\u0010=\u001a\b\u0012\u0004\u0012\u000207062\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J#\u0010>\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020706H\u0082 J\u0015\u0010B\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u001d\u0010C\u001a\u00020\u00142\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u001e\u001a\u00020\u0002H\u0082 J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0096\u0002J\u0019\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0082 J\b\u0010K\u001a\u00020LH\u0016J\u0014\u0010M\u001a\u00020\u00142\f\u0010N\u001a\b\u0012\u0004\u0012\u00020P0OJ\u0015\u0010Q\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u0006\u0010R\u001a\u00020\u0002J\u0015\u0010S\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0082 J\u000e\u0010T\u001a\u00020\u00022\u0006\u0010U\u001a\u00020\u0002J\u001d\u0010V\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010U\u001a\u00020\u0002H\u0082 J\u0015\u0010W\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00020\u0003H\u0082 J\b\u0010c\u001a\u00020\u0003H\u0016J\u0016\u0010d\u001a\b\u0012\u0004\u0012\u00020G0e2\u0006\u0010f\u001a\u00020LH\u0016J\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020G0e2\u0006\u0010f\u001a\u00020LH\u0082 R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR$\u0010%\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010,\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001bR$\u00101\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR0\u00108\u001a\b\u0012\u0004\u0012\u000207062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u000207068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010?\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u0010\u0019\"\u0004\bA\u0010\u001bR(\u0010X\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u0014\u0018\u00010YX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010^\u001a\u00020LX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010b¨\u0006k"}, d2 = {"Lcom/polymarket/data/ECountry;", "Lskip/lib/Identifiable;", "", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "newValue", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Swift_id", "Swift_id_set", "value", Keys.KEY_NAME, "getName", "setName", "Swift_name", "Swift_name_set", "Lcom/polymarket/data/ECountry$Symbol;", "symbol", "getSymbol", "()Lcom/polymarket/data/ECountry$Symbol;", "setSymbol", "(Lcom/polymarket/data/ECountry$Symbol;)V", "Swift_symbol", "Swift_symbol_set", ApiConstant.KEY_CODE, "getCode", "setCode", "Swift_code", "Swift_code_set", "placeholder", "getPlaceholder", "setPlaceholder", "Swift_placeholder", "Swift_placeholder_set", "", "Lcom/polymarket/data/ECountry$Format;", "formats", "getFormats", "()Ljava/util/List;", "setFormats", "(Ljava/util/List;)V", "Swift_formats", "Swift_formats_set", "regex", "getRegex", "setRegex", "Swift_regex", "Swift_regex_set", "equals", "", "other", "", "Swift_isequal", "lhs", "rhs", "hashCode", "", "hash", "into", "Lskip/lib/InOut;", "Lskip/lib/Hasher;", "Swift_hashvalue", "codeWithPlus", "Swift_codeWithPlus_1", "phoneWithCode", AttributeType.PHONE, "Swift_phoneWithCode_2", "Swift_constructor_3", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "()I", "setSmutatingcount", "(I)V", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Format", "Symbol", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ECountry implements Identifiable<String>, MutableStruct, SwiftPeerBridged, SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long Swift_peer;
    private int smutatingcount;
    private Function1<Object, Unit> supdate;

    private ECountry(MutableStruct mutableStruct) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_3(mutableStruct);
    }

    private final native String Swift_code(long Swift_peer);

    private final native String Swift_codeWithPlus_1(long Swift_peer);

    private final native void Swift_code_set(long Swift_peer, String value);

    private final native long Swift_constructor_3(MutableStruct copy);

    private final native List<Format> Swift_formats(long Swift_peer);

    private final native void Swift_formats_set(long Swift_peer, List<Format> value);

    private final native long Swift_hashvalue(long Swift_peer);

    private final native String Swift_id(long Swift_peer);

    private final native void Swift_id_set(long Swift_peer, String value);

    private final native boolean Swift_isequal(ECountry lhs, ECountry rhs);

    private final native String Swift_name(long Swift_peer);

    private final native void Swift_name_set(long Swift_peer, String value);

    private final native String Swift_phoneWithCode_2(long Swift_peer, String phone);

    private final native String Swift_placeholder(long Swift_peer);

    private final native void Swift_placeholder_set(long Swift_peer, String value);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_regex(long Swift_peer);

    private final native void Swift_regex_set(long Swift_peer, String value);

    private final native void Swift_release(long Swift_peer);

    private final native Symbol Swift_symbol(long Swift_peer);

    private final native void Swift_symbol_set(long Swift_peer, Symbol value);

    public static /* synthetic */ Unit a(Ref.ObjectRef objectRef, Hasher hasher) {
        return hashCode$lambda$1(objectRef, hasher);
    }

    public static /* synthetic */ Hasher b(Ref.ObjectRef objectRef) {
        return hashCode$lambda$0(objectRef);
    }

    private static final Hasher hashCode$lambda$0(Ref.ObjectRef objectRef) {
        return (Hasher) objectRef.a;
    }

    private static final Unit hashCode$lambda$1(Ref.ObjectRef objectRef, Hasher hasher) {
        hasher.getClass();
        objectRef.a = hasher;
        return Unit.INSTANCE;
    }

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String codeWithPlus() {
        return Swift_codeWithPlus_1(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    public boolean equals(Object other) {
        if (!(other instanceof ECountry)) {
            return false;
        }
        return Swift_isequal(this, (ECountry) other);
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final String getCode() {
        return Swift_code(this.Swift_peer);
    }

    public final List<Format> getFormats() {
        return Swift_formats(this.Swift_peer);
    }

    @Override // skip.lib.Identifiable
    /* renamed from: getId, reason: avoid collision after fix types in other method */
    public String getId2() {
        return Swift_id(this.Swift_peer);
    }

    public final String getName() {
        return Swift_name(this.Swift_peer);
    }

    public final String getPlaceholder() {
        return Swift_placeholder(this.Swift_peer);
    }

    public final String getRegex() {
        return Swift_regex(this.Swift_peer);
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final Symbol getSymbol() {
        return Swift_symbol(this.Swift_peer);
    }

    public final void hash(InOut<Hasher> into) {
        into.getClass();
        into.getValue().combine(Long.valueOf(Swift_hashvalue(this.Swift_peer)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    public int hashCode() {
        ?? obj = new Object();
        obj.a = new Hasher();
        hash(new InOut<>(new pc0(obj, 13), new qc0(obj, 10)));
        return ((Hasher) obj.a).getResult();
    }

    public final String phoneWithCode(String phone) {
        phone.getClass();
        return Swift_phoneWithCode_2(this.Swift_peer, phone);
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new ECountry(this);
    }

    public final void setCode(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_code_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setFormats(List<Format> list) {
        list.getClass();
        List<Format> list2 = (List) StructKt.sref$default(list, null, 1, null);
        willmutate();
        try {
            Swift_formats_set(this.Swift_peer, list2);
        } finally {
            didmutate();
        }
    }

    public void setId(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_id_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setName(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_name_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setPlaceholder(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_placeholder_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    public final void setRegex(String str) {
        str.getClass();
        willmutate();
        try {
            Swift_regex_set(this.Swift_peer, str);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public final void setSymbol(Symbol symbol) {
        symbol.getClass();
        willmutate();
        try {
            Swift_symbol_set(this.Swift_peer, symbol);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0003\b\u0089\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u0097\u00022\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u00020\u00000\u0005:\u0002\u0097\u0002B\u001d\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u008f\u0002\u001a\u00020\u00032\u0007\u0010\u0090\u0002\u001a\u00020\u0003H\u0082 J\u001b\u0010\u0091\u0002\u001a\n\u0012\u0005\u0012\u00030\u0093\u00020\u0092\u00022\b\u0010\u0094\u0002\u001a\u00030\u0095\u0002H\u0016J\u001c\u0010\u0096\u0002\u001a\n\u0012\u0005\u0012\u00030\u0093\u00020\u0092\u00022\b\u0010\u0094\u0002\u001a\u00030\u0095\u0002H\u0082 R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u008d\u0002\u001a\u00020\u00038F¢\u0006\u0007\u001a\u0005\b\u008e\u0002\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002¨\u0006\u0098\u0002"}, d2 = {"Lcom/polymarket/data/ECountry$Symbol;", "Lskip/lib/CaseIterable;", "Lskip/lib/RawRepresentable;", "", "Lskip/lib/SwiftProjecting;", "", "rawValue", "unusedp", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Void;)V", "getRawValue", "()Ljava/lang/String;", "AF", "AX", "AL", "DZ", "AS", "AD", "AO", "AI", "AQ", "AG", "AR", "AM", "AW", "AC", "AU", "AT", "AZ", "BS", "BH", "BD", "BB", "BY", "BE", "BZ", "BJ", "BM", "BT", "BO", "BQ", "BA", "BW", "BR", "IO", "VG", "BN", "BG", "BF", "BI", "KH", "CM", "CA", "CV", "KY", "CF", "TD", "CL", "CX", "CC", "CO", "KM", "CK", "CR", "HR", "CU", "CW", "CY", "CZ", "CD", "DK", "DJ", "DM", "DO", "TL", "EC", "EG", "SV", "GQ", "ER", "EE", "ET", "FK", "FO", "FJ", "FI", "FR", "GF", "PF", "GA", "GM", "GE", "DE", "GH", "GI", "GR", "GL", "GD", "GP", "GU", "GT", "GG", "GN", "GW", "GY", "HT", "HN", "HK", "HU", "IS", "IN", "ID", "IR", "IQ", "IE", "IM", "IL", "IT", "CI", "CN", "JM", "JP", "JE", "JO", "KZ", "KE", "KI", "XK", "KW", "KG", "LA", "LV", "LB", "LS", "LR", "LY", "LI", "LT", "LU", "MO", "MK", "MG", "MW", "MY", "MV", "ML", "MT", "MH", "MQ", "MR", "MU", "YT", "MX", "FM", "MD", "MC", "MN", "ME", "MS", "MA", "MZ", "MM", "NA", "NR", "NP", "NL", "NC", "NZ", "NI", "NE", "NG", "NU", "NF", "KP", "MP", "NO", "OM", "PK", "PW", "PS", "PA", "PG", "PY", "PE", "PH", "PN", "PL", "PT", "PR", "QA", "CG", "RE", "RO", "RU", "RW", "BL", "SH", "KN", "LC", "MF", "PM", "VC", "WS", "SM", "ST", "SA", "SN", "RS", "SC", "SL", "SG", "SX", "SK", "SI", "SB", "SO", "ZA", "GS", "KR", "SS", "ES", "LK", "SD", "SR", "SJ", "SZ", "SE", "CH", "SY", "TW", "TJ", "TZ", "TH", "TG", "TK", "TO", "TT", "TN", "TR", "TM", "TC", "TV", "VI", "UG", "UA", "AE", "GB", "US", "UM", "UY", "UZ", "VU", "VA", "VE", "VN", "WF", "EH", "YE", "ZM", "ZW", "BV", "IC", "CP", "TF", "HM", "DG", "EA", "TA", "flag", "getFlag", "Swift_flag", Keys.KEY_NAME, "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Symbol implements CaseIterable, RawRepresentable<String>, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Symbol[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String rawValue;
        public static final Symbol AF = new Symbol("AF", 0, "AF", null, 2, null);
        public static final Symbol AX = new Symbol("AX", 1, "AX", null, 2, null);
        public static final Symbol AL = new Symbol("AL", 2, "AL", null, 2, null);
        public static final Symbol DZ = new Symbol("DZ", 3, "DZ", null, 2, null);
        public static final Symbol AS = new Symbol("AS", 4, "AS", null, 2, null);
        public static final Symbol AD = new Symbol("AD", 5, "AD", null, 2, null);
        public static final Symbol AO = new Symbol("AO", 6, "AO", null, 2, null);
        public static final Symbol AI = new Symbol("AI", 7, "AI", null, 2, null);
        public static final Symbol AQ = new Symbol("AQ", 8, "AQ", null, 2, null);
        public static final Symbol AG = new Symbol("AG", 9, "AG", null, 2, null);
        public static final Symbol AR = new Symbol("AR", 10, "AR", null, 2, null);
        public static final Symbol AM = new Symbol("AM", 11, "AM", null, 2, null);
        public static final Symbol AW = new Symbol("AW", 12, "AW", null, 2, null);
        public static final Symbol AC = new Symbol("AC", 13, "AC", null, 2, null);
        public static final Symbol AU = new Symbol("AU", 14, "AU", null, 2, null);
        public static final Symbol AT = new Symbol("AT", 15, "AT", null, 2, null);
        public static final Symbol AZ = new Symbol("AZ", 16, "AZ", null, 2, null);
        public static final Symbol BS = new Symbol("BS", 17, "BS", null, 2, null);
        public static final Symbol BH = new Symbol("BH", 18, "BH", null, 2, null);
        public static final Symbol BD = new Symbol("BD", 19, "BD", null, 2, null);
        public static final Symbol BB = new Symbol("BB", 20, "BB", null, 2, null);
        public static final Symbol BY = new Symbol("BY", 21, "BY", null, 2, null);
        public static final Symbol BE = new Symbol("BE", 22, "BE", null, 2, null);
        public static final Symbol BZ = new Symbol("BZ", 23, "BZ", null, 2, null);
        public static final Symbol BJ = new Symbol("BJ", 24, "BJ", null, 2, null);
        public static final Symbol BM = new Symbol("BM", 25, "BM", null, 2, null);
        public static final Symbol BT = new Symbol("BT", 26, "BT", null, 2, null);
        public static final Symbol BO = new Symbol("BO", 27, "BO", null, 2, null);
        public static final Symbol BQ = new Symbol("BQ", 28, "BQ", null, 2, null);
        public static final Symbol BA = new Symbol("BA", 29, "BA", null, 2, null);
        public static final Symbol BW = new Symbol("BW", 30, "BW", null, 2, null);
        public static final Symbol BR = new Symbol("BR", 31, "BR", null, 2, null);
        public static final Symbol IO = new Symbol("IO", 32, "IO", null, 2, null);
        public static final Symbol VG = new Symbol("VG", 33, "VG", null, 2, null);
        public static final Symbol BN = new Symbol("BN", 34, "BN", null, 2, null);
        public static final Symbol BG = new Symbol("BG", 35, "BG", null, 2, null);
        public static final Symbol BF = new Symbol("BF", 36, "BF", null, 2, null);
        public static final Symbol BI = new Symbol("BI", 37, "BI", null, 2, null);
        public static final Symbol KH = new Symbol("KH", 38, "KH", null, 2, null);
        public static final Symbol CM = new Symbol("CM", 39, "CM", null, 2, null);
        public static final Symbol CA = new Symbol("CA", 40, "CA", null, 2, null);
        public static final Symbol CV = new Symbol("CV", 41, "CV", null, 2, null);
        public static final Symbol KY = new Symbol("KY", 42, "KY", null, 2, null);
        public static final Symbol CF = new Symbol("CF", 43, "CF", null, 2, null);
        public static final Symbol TD = new Symbol("TD", 44, "TD", null, 2, null);
        public static final Symbol CL = new Symbol("CL", 45, "CL", null, 2, null);
        public static final Symbol CX = new Symbol("CX", 46, "CX", null, 2, null);
        public static final Symbol CC = new Symbol("CC", 47, "CC", null, 2, null);
        public static final Symbol CO = new Symbol("CO", 48, "CO", null, 2, null);
        public static final Symbol KM = new Symbol("KM", 49, "KM", null, 2, null);
        public static final Symbol CK = new Symbol("CK", 50, "CK", null, 2, null);
        public static final Symbol CR = new Symbol("CR", 51, "CR", null, 2, null);
        public static final Symbol HR = new Symbol("HR", 52, "HR", null, 2, null);
        public static final Symbol CU = new Symbol("CU", 53, "CU", null, 2, null);
        public static final Symbol CW = new Symbol("CW", 54, "CW", null, 2, null);
        public static final Symbol CY = new Symbol("CY", 55, "CY", null, 2, null);
        public static final Symbol CZ = new Symbol("CZ", 56, "CZ", null, 2, null);
        public static final Symbol CD = new Symbol("CD", 57, "CD", null, 2, null);
        public static final Symbol DK = new Symbol("DK", 58, "DK", null, 2, null);
        public static final Symbol DJ = new Symbol("DJ", 59, "DJ", null, 2, null);
        public static final Symbol DM = new Symbol("DM", 60, "DM", null, 2, null);
        public static final Symbol DO = new Symbol("DO", 61, "DO", null, 2, null);
        public static final Symbol TL = new Symbol("TL", 62, "TL", null, 2, null);
        public static final Symbol EC = new Symbol("EC", 63, "EC", null, 2, null);
        public static final Symbol EG = new Symbol("EG", 64, "EG", null, 2, null);
        public static final Symbol SV = new Symbol("SV", 65, "SV", null, 2, null);
        public static final Symbol GQ = new Symbol("GQ", 66, "GQ", null, 2, null);
        public static final Symbol ER = new Symbol("ER", 67, "ER", null, 2, null);
        public static final Symbol EE = new Symbol("EE", 68, "EE", null, 2, null);
        public static final Symbol ET = new Symbol("ET", 69, "ET", null, 2, null);
        public static final Symbol FK = new Symbol("FK", 70, "FK", null, 2, null);
        public static final Symbol FO = new Symbol("FO", 71, "FO", null, 2, null);
        public static final Symbol FJ = new Symbol("FJ", 72, "FJ", null, 2, null);
        public static final Symbol FI = new Symbol("FI", 73, "FI", null, 2, null);
        public static final Symbol FR = new Symbol("FR", 74, "FR", null, 2, null);
        public static final Symbol GF = new Symbol("GF", 75, "GF", null, 2, null);
        public static final Symbol PF = new Symbol("PF", 76, "PF", null, 2, null);
        public static final Symbol GA = new Symbol("GA", 77, "GA", null, 2, null);
        public static final Symbol GM = new Symbol("GM", 78, "GM", null, 2, null);
        public static final Symbol GE = new Symbol("GE", 79, "GE", null, 2, null);
        public static final Symbol DE = new Symbol("DE", 80, "DE", null, 2, null);
        public static final Symbol GH = new Symbol("GH", 81, "GH", null, 2, null);
        public static final Symbol GI = new Symbol("GI", 82, "GI", null, 2, null);
        public static final Symbol GR = new Symbol("GR", 83, "GR", null, 2, null);
        public static final Symbol GL = new Symbol("GL", 84, "GL", null, 2, null);
        public static final Symbol GD = new Symbol("GD", 85, "GD", null, 2, null);
        public static final Symbol GP = new Symbol("GP", 86, "GP", null, 2, null);
        public static final Symbol GU = new Symbol("GU", 87, "GU", null, 2, null);
        public static final Symbol GT = new Symbol("GT", 88, "GT", null, 2, null);
        public static final Symbol GG = new Symbol("GG", 89, "GG", null, 2, null);
        public static final Symbol GN = new Symbol("GN", 90, "GN", null, 2, null);
        public static final Symbol GW = new Symbol("GW", 91, "GW", null, 2, null);
        public static final Symbol GY = new Symbol("GY", 92, "GY", null, 2, null);
        public static final Symbol HT = new Symbol("HT", 93, "HT", null, 2, null);
        public static final Symbol HN = new Symbol("HN", 94, "HN", null, 2, null);
        public static final Symbol HK = new Symbol("HK", 95, "HK", null, 2, null);
        public static final Symbol HU = new Symbol("HU", 96, "HU", null, 2, null);
        public static final Symbol IS = new Symbol("IS", 97, "IS", null, 2, null);
        public static final Symbol IN = new Symbol("IN", 98, "IN", null, 2, null);
        public static final Symbol ID = new Symbol("ID", 99, "ID", null, 2, null);
        public static final Symbol IR = new Symbol("IR", 100, "IR", null, 2, null);
        public static final Symbol IQ = new Symbol("IQ", 101, "IQ", null, 2, null);
        public static final Symbol IE = new Symbol("IE", 102, "IE", null, 2, null);
        public static final Symbol IM = new Symbol("IM", HttpStatusCodesKt.HTTP_EARLY_HINTS, "IM", null, 2, null);
        public static final Symbol IL = new Symbol("IL", 104, "IL", null, 2, null);
        public static final Symbol IT = new Symbol("IT", 105, "IT", null, 2, null);
        public static final Symbol CI = new Symbol("CI", 106, "CI", null, 2, null);
        public static final Symbol CN = new Symbol("CN", 107, "CN", null, 2, null);
        public static final Symbol JM = new Symbol("JM", 108, "JM", null, 2, null);
        public static final Symbol JP = new Symbol("JP", 109, "JP", null, 2, null);
        public static final Symbol JE = new Symbol("JE", 110, "JE", null, 2, null);
        public static final Symbol JO = new Symbol("JO", 111, "JO", null, 2, null);
        public static final Symbol KZ = new Symbol("KZ", 112, "KZ", null, 2, null);
        public static final Symbol KE = new Symbol("KE", 113, "KE", null, 2, null);
        public static final Symbol KI = new Symbol("KI", 114, "KI", null, 2, null);
        public static final Symbol XK = new Symbol("XK", 115, "XK", null, 2, null);
        public static final Symbol KW = new Symbol("KW", 116, "KW", null, 2, null);
        public static final Symbol KG = new Symbol("KG", 117, "KG", null, 2, null);
        public static final Symbol LA = new Symbol("LA", 118, "LA", null, 2, null);
        public static final Symbol LV = new Symbol("LV", 119, "LV", null, 2, null);
        public static final Symbol LB = new Symbol("LB", 120, "LB", null, 2, null);
        public static final Symbol LS = new Symbol("LS", 121, "LS", null, 2, null);
        public static final Symbol LR = new Symbol("LR", 122, "LR", null, 2, null);
        public static final Symbol LY = new Symbol("LY", 123, "LY", null, 2, null);
        public static final Symbol LI = new Symbol("LI", 124, "LI", null, 2, null);
        public static final Symbol LT = new Symbol("LT", 125, "LT", null, 2, null);
        public static final Symbol LU = new Symbol("LU", WebSocketProtocol.PAYLOAD_SHORT, "LU", null, 2, null);
        public static final Symbol MO = new Symbol("MO", 127, "MO", null, 2, null);
        public static final Symbol MK = new Symbol("MK", 128, "MK", null, 2, null);
        public static final Symbol MG = new Symbol("MG", 129, "MG", null, 2, null);
        public static final Symbol MW = new Symbol("MW", 130, "MW", null, 2, null);
        public static final Symbol MY = new Symbol("MY", 131, "MY", null, 2, null);
        public static final Symbol MV = new Symbol("MV", 132, "MV", null, 2, null);
        public static final Symbol ML = new Symbol("ML", 133, "ML", null, 2, null);
        public static final Symbol MT = new Symbol("MT", 134, "MT", null, 2, null);
        public static final Symbol MH = new Symbol("MH", 135, "MH", null, 2, null);
        public static final Symbol MQ = new Symbol("MQ", 136, "MQ", null, 2, null);
        public static final Symbol MR = new Symbol("MR", 137, "MR", null, 2, null);
        public static final Symbol MU = new Symbol("MU", 138, "MU", null, 2, null);
        public static final Symbol YT = new Symbol("YT", 139, "YT", null, 2, null);
        public static final Symbol MX = new Symbol("MX", 140, "MX", null, 2, null);
        public static final Symbol FM = new Symbol("FM", 141, "FM", null, 2, null);
        public static final Symbol MD = new Symbol("MD", 142, "MD", null, 2, null);
        public static final Symbol MC = new Symbol("MC", 143, "MC", null, 2, null);
        public static final Symbol MN = new Symbol("MN", 144, "MN", null, 2, null);
        public static final Symbol ME = new Symbol("ME", 145, "ME", null, 2, null);
        public static final Symbol MS = new Symbol("MS", 146, "MS", null, 2, null);
        public static final Symbol MA = new Symbol("MA", 147, "MA", null, 2, null);
        public static final Symbol MZ = new Symbol("MZ", 148, "MZ", null, 2, null);
        public static final Symbol MM = new Symbol("MM", 149, "MM", null, 2, null);
        public static final Symbol NA = new Symbol("NA", 150, "NA", null, 2, null);
        public static final Symbol NR = new Symbol("NR", 151, "NR", null, 2, null);
        public static final Symbol NP = new Symbol("NP", 152, "NP", null, 2, null);
        public static final Symbol NL = new Symbol("NL", 153, "NL", null, 2, null);
        public static final Symbol NC = new Symbol("NC", 154, "NC", null, 2, null);
        public static final Symbol NZ = new Symbol("NZ", 155, "NZ", null, 2, null);
        public static final Symbol NI = new Symbol("NI", 156, "NI", null, 2, null);
        public static final Symbol NE = new Symbol("NE", 157, "NE", null, 2, null);
        public static final Symbol NG = new Symbol("NG", 158, "NG", null, 2, null);
        public static final Symbol NU = new Symbol("NU", 159, "NU", null, 2, null);
        public static final Symbol NF = new Symbol("NF", 160, "NF", null, 2, null);
        public static final Symbol KP = new Symbol("KP", 161, "KP", null, 2, null);
        public static final Symbol MP = new Symbol("MP", 162, "MP", null, 2, null);
        public static final Symbol NO = new Symbol("NO", 163, "NO", null, 2, null);
        public static final Symbol OM = new Symbol("OM", 164, "OM", null, 2, null);
        public static final Symbol PK = new Symbol("PK", 165, "PK", null, 2, null);
        public static final Symbol PW = new Symbol("PW", 166, "PW", null, 2, null);
        public static final Symbol PS = new Symbol("PS", 167, "PS", null, 2, null);
        public static final Symbol PA = new Symbol("PA", 168, "PA", null, 2, null);
        public static final Symbol PG = new Symbol("PG", 169, "PG", null, 2, null);
        public static final Symbol PY = new Symbol("PY", 170, "PY", null, 2, null);
        public static final Symbol PE = new Symbol("PE", 171, "PE", null, 2, null);
        public static final Symbol PH = new Symbol("PH", 172, "PH", null, 2, null);
        public static final Symbol PN = new Symbol("PN", 173, "PN", null, 2, null);
        public static final Symbol PL = new Symbol("PL", 174, "PL", null, 2, null);
        public static final Symbol PT = new Symbol("PT", 175, "PT", null, 2, null);
        public static final Symbol PR = new Symbol("PR", 176, "PR", null, 2, null);
        public static final Symbol QA = new Symbol("QA", 177, "QA", null, 2, null);
        public static final Symbol CG = new Symbol("CG", 178, "CG", null, 2, null);
        public static final Symbol RE = new Symbol("RE", 179, "RE", null, 2, null);
        public static final Symbol RO = new Symbol("RO", BlurConstants.H_BD, "RO", null, 2, null);
        public static final Symbol RU = new Symbol("RU", 181, "RU", null, 2, null);
        public static final Symbol RW = new Symbol("RW", 182, "RW", null, 2, null);
        public static final Symbol BL = new Symbol("BL", 183, "BL", null, 2, null);
        public static final Symbol SH = new Symbol("SH", 184, "SH", null, 2, null);
        public static final Symbol KN = new Symbol("KN", ModuleDescriptor.MODULE_VERSION, "KN", null, 2, null);
        public static final Symbol LC = new Symbol("LC", 186, "LC", null, 2, null);
        public static final Symbol MF = new Symbol("MF", 187, "MF", null, 2, null);
        public static final Symbol PM = new Symbol("PM", 188, "PM", null, 2, null);
        public static final Symbol VC = new Symbol("VC", 189, "VC", null, 2, null);
        public static final Symbol WS = new Symbol("WS", 190, "WS", null, 2, null);
        public static final Symbol SM = new Symbol("SM", 191, "SM", null, 2, null);
        public static final Symbol ST = new Symbol("ST", 192, "ST", null, 2, null);
        public static final Symbol SA = new Symbol("SA", 193, "SA", null, 2, null);
        public static final Symbol SN = new Symbol("SN", 194, "SN", null, 2, null);
        public static final Symbol RS = new Symbol("RS", 195, "RS", null, 2, null);
        public static final Symbol SC = new Symbol("SC", 196, "SC", null, 2, null);
        public static final Symbol SL = new Symbol("SL", 197, "SL", null, 2, null);
        public static final Symbol SG = new Symbol("SG", 198, "SG", null, 2, null);
        public static final Symbol SX = new Symbol("SX", 199, "SX", null, 2, null);
        public static final Symbol SK = new Symbol("SK", 200, "SK", null, 2, null);
        public static final Symbol SI = new Symbol("SI", MlKitException.CODE_SCANNER_CANCELLED, "SI", null, 2, null);
        public static final Symbol SB = new Symbol("SB", MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, "SB", null, 2, null);
        public static final Symbol SO = new Symbol("SO", MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, "SO", null, 2, null);
        public static final Symbol ZA = new Symbol("ZA", MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, "ZA", null, 2, null);
        public static final Symbol GS = new Symbol("GS", MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, "GS", null, 2, null);
        public static final Symbol KR = new Symbol("KR", MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, "KR", null, 2, null);
        public static final Symbol SS = new Symbol("SS", MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, "SS", null, 2, null);
        public static final Symbol ES = new Symbol("ES", 208, "ES", null, 2, null);
        public static final Symbol LK = new Symbol("LK", 209, "LK", null, 2, null);
        public static final Symbol SD = new Symbol("SD", 210, "SD", null, 2, null);
        public static final Symbol SR = new Symbol("SR", 211, "SR", null, 2, null);
        public static final Symbol SJ = new Symbol("SJ", 212, "SJ", null, 2, null);
        public static final Symbol SZ = new Symbol("SZ", 213, "SZ", null, 2, null);
        public static final Symbol SE = new Symbol("SE", 214, "SE", null, 2, null);
        public static final Symbol CH = new Symbol("CH", 215, "CH", null, 2, null);
        public static final Symbol SY = new Symbol("SY", 216, "SY", null, 2, null);
        public static final Symbol TW = new Symbol("TW", 217, "TW", null, 2, null);
        public static final Symbol TJ = new Symbol("TJ", 218, "TJ", null, 2, null);
        public static final Symbol TZ = new Symbol("TZ", 219, "TZ", null, 2, null);
        public static final Symbol TH = new Symbol("TH", 220, "TH", null, 2, null);
        public static final Symbol TG = new Symbol("TG", 221, "TG", null, 2, null);
        public static final Symbol TK = new Symbol("TK", 222, "TK", null, 2, null);
        public static final Symbol TO = new Symbol("TO", 223, "TO", null, 2, null);
        public static final Symbol TT = new Symbol("TT", 224, "TT", null, 2, null);
        public static final Symbol TN = new Symbol("TN", 225, "TN", null, 2, null);
        public static final Symbol TR = new Symbol("TR", 226, "TR", null, 2, null);
        public static final Symbol TM = new Symbol("TM", 227, "TM", null, 2, null);
        public static final Symbol TC = new Symbol("TC", 228, "TC", null, 2, null);
        public static final Symbol TV = new Symbol("TV", 229, "TV", null, 2, null);
        public static final Symbol VI = new Symbol("VI", 230, "VI", null, 2, null);
        public static final Symbol UG = new Symbol("UG", 231, "UG", null, 2, null);
        public static final Symbol UA = new Symbol("UA", 232, "UA", null, 2, null);
        public static final Symbol AE = new Symbol("AE", 233, "AE", null, 2, null);
        public static final Symbol GB = new Symbol("GB", 234, "GB", null, 2, null);
        public static final Symbol US = new Symbol("US", 235, "US", null, 2, null);
        public static final Symbol UM = new Symbol("UM", 236, "UM", null, 2, null);
        public static final Symbol UY = new Symbol("UY", 237, "UY", null, 2, null);
        public static final Symbol UZ = new Symbol("UZ", 238, "UZ", null, 2, null);
        public static final Symbol VU = new Symbol("VU", 239, "VU", null, 2, null);
        public static final Symbol VA = new Symbol("VA", 240, "VA", null, 2, null);
        public static final Symbol VE = new Symbol("VE", 241, "VE", null, 2, null);
        public static final Symbol VN = new Symbol("VN", 242, "VN", null, 2, null);
        public static final Symbol WF = new Symbol("WF", 243, "WF", null, 2, null);
        public static final Symbol EH = new Symbol("EH", 244, "EH", null, 2, null);
        public static final Symbol YE = new Symbol("YE", 245, "YE", null, 2, null);
        public static final Symbol ZM = new Symbol("ZM", 246, "ZM", null, 2, null);
        public static final Symbol ZW = new Symbol("ZW", 247, "ZW", null, 2, null);
        public static final Symbol BV = new Symbol("BV", 248, "BV", null, 2, null);
        public static final Symbol IC = new Symbol("IC", 249, "IC", null, 2, null);
        public static final Symbol CP = new Symbol("CP", RadarSimpleLogBuffer.PURGE_AMOUNT, "CP", null, 2, null);
        public static final Symbol TF = new Symbol("TF", 251, "TF", null, 2, null);
        public static final Symbol HM = new Symbol("HM", 252, "HM", null, 2, null);
        public static final Symbol DG = new Symbol("DG", 253, "DG", null, 2, null);
        public static final Symbol EA = new Symbol("EA", 254, "EA", null, 2, null);
        public static final Symbol TA = new Symbol("TA", 255, "TA", null, 2, null);

        private static final /* synthetic */ Symbol[] $values() {
            return new Symbol[]{AF, AX, AL, DZ, AS, AD, AO, AI, AQ, AG, AR, AM, AW, AC, AU, AT, AZ, BS, BH, BD, BB, BY, BE, BZ, BJ, BM, BT, BO, BQ, BA, BW, BR, IO, VG, BN, BG, BF, BI, KH, CM, CA, CV, KY, CF, TD, CL, CX, CC, CO, KM, CK, CR, HR, CU, CW, CY, CZ, CD, DK, DJ, DM, DO, TL, EC, EG, SV, GQ, ER, EE, ET, FK, FO, FJ, FI, FR, GF, PF, GA, GM, GE, DE, GH, GI, GR, GL, GD, GP, GU, GT, GG, GN, GW, GY, HT, HN, HK, HU, IS, IN, ID, IR, IQ, IE, IM, IL, IT, CI, CN, JM, JP, JE, JO, KZ, KE, KI, XK, KW, KG, LA, LV, LB, LS, LR, LY, LI, LT, LU, MO, MK, MG, MW, MY, MV, ML, MT, MH, MQ, MR, MU, YT, MX, FM, MD, MC, MN, ME, MS, MA, MZ, MM, NA, NR, NP, NL, NC, NZ, NI, NE, NG, NU, NF, KP, MP, NO, OM, PK, PW, PS, PA, PG, PY, PE, PH, PN, PL, PT, PR, QA, CG, RE, RO, RU, RW, BL, SH, KN, LC, MF, PM, VC, WS, SM, ST, SA, SN, RS, SC, SL, SG, SX, SK, SI, SB, SO, ZA, GS, KR, SS, ES, LK, SD, SR, SJ, SZ, SE, CH, SY, TW, TJ, TZ, TH, TG, TK, TO, TT, TN, TR, TM, TC, TV, VI, UG, UA, AE, GB, US, UM, UY, UZ, VU, VA, VE, VN, WF, EH, YE, ZM, ZW, BV, IC, CP, TF, HM, DG, EA, TA};
        }

        static {
            Symbol[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        public /* synthetic */ Symbol(String str, int i, String str2, Void r4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 2) != 0 ? null : r4);
        }

        private final native String Swift_flag(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Symbol valueOf(String str) {
            return (Symbol) Enum.valueOf(Symbol.class, str);
        }

        public static Symbol[] values() {
            return (Symbol[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getFlag() {
            return Swift_flag(name());
        }

        @Override // skip.lib.RawRepresentable
        public /* bridge */ /* synthetic */ String getRawValue() {
            return getRawValue();
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/polymarket/data/ECountry$Symbol$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/data/ECountry$Symbol;", "<init>", "()V", "init", "rawValue", "", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion implements CaseIterableCompanion<Symbol> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<Symbol> getAllCases() {
                return ArrayKt.arrayOf(Symbol.AF, Symbol.AX, Symbol.AL, Symbol.DZ, Symbol.AS, Symbol.AD, Symbol.AO, Symbol.AI, Symbol.AQ, Symbol.AG, Symbol.AR, Symbol.AM, Symbol.AW, Symbol.AC, Symbol.AU, Symbol.AT, Symbol.AZ, Symbol.BS, Symbol.BH, Symbol.BD, Symbol.BB, Symbol.BY, Symbol.BE, Symbol.BZ, Symbol.BJ, Symbol.BM, Symbol.BT, Symbol.BO, Symbol.BQ, Symbol.BA, Symbol.BW, Symbol.BR, Symbol.IO, Symbol.VG, Symbol.BN, Symbol.BG, Symbol.BF, Symbol.BI, Symbol.KH, Symbol.CM, Symbol.CA, Symbol.CV, Symbol.KY, Symbol.CF, Symbol.TD, Symbol.CL, Symbol.CX, Symbol.CC, Symbol.CO, Symbol.KM, Symbol.CK, Symbol.CR, Symbol.HR, Symbol.CU, Symbol.CW, Symbol.CY, Symbol.CZ, Symbol.CD, Symbol.DK, Symbol.DJ, Symbol.DM, Symbol.DO, Symbol.TL, Symbol.EC, Symbol.EG, Symbol.SV, Symbol.GQ, Symbol.ER, Symbol.EE, Symbol.ET, Symbol.FK, Symbol.FO, Symbol.FJ, Symbol.FI, Symbol.FR, Symbol.GF, Symbol.PF, Symbol.GA, Symbol.GM, Symbol.GE, Symbol.DE, Symbol.GH, Symbol.GI, Symbol.GR, Symbol.GL, Symbol.GD, Symbol.GP, Symbol.GU, Symbol.GT, Symbol.GG, Symbol.GN, Symbol.GW, Symbol.GY, Symbol.HT, Symbol.HN, Symbol.HK, Symbol.HU, Symbol.IS, Symbol.IN, Symbol.ID, Symbol.IR, Symbol.IQ, Symbol.IE, Symbol.IM, Symbol.IL, Symbol.IT, Symbol.CI, Symbol.CN, Symbol.JM, Symbol.JP, Symbol.JE, Symbol.JO, Symbol.KZ, Symbol.KE, Symbol.KI, Symbol.XK, Symbol.KW, Symbol.KG, Symbol.LA, Symbol.LV, Symbol.LB, Symbol.LS, Symbol.LR, Symbol.LY, Symbol.LI, Symbol.LT, Symbol.LU, Symbol.MO, Symbol.MK, Symbol.MG, Symbol.MW, Symbol.MY, Symbol.MV, Symbol.ML, Symbol.MT, Symbol.MH, Symbol.MQ, Symbol.MR, Symbol.MU, Symbol.YT, Symbol.MX, Symbol.FM, Symbol.MD, Symbol.MC, Symbol.MN, Symbol.ME, Symbol.MS, Symbol.MA, Symbol.MZ, Symbol.MM, Symbol.NA, Symbol.NR, Symbol.NP, Symbol.NL, Symbol.NC, Symbol.NZ, Symbol.NI, Symbol.NE, Symbol.NG, Symbol.NU, Symbol.NF, Symbol.KP, Symbol.MP, Symbol.NO, Symbol.OM, Symbol.PK, Symbol.PW, Symbol.PS, Symbol.PA, Symbol.PG, Symbol.PY, Symbol.PE, Symbol.PH, Symbol.PN, Symbol.PL, Symbol.PT, Symbol.PR, Symbol.QA, Symbol.CG, Symbol.RE, Symbol.RO, Symbol.RU, Symbol.RW, Symbol.BL, Symbol.SH, Symbol.KN, Symbol.LC, Symbol.MF, Symbol.PM, Symbol.VC, Symbol.WS, Symbol.SM, Symbol.ST, Symbol.SA, Symbol.SN, Symbol.RS, Symbol.SC, Symbol.SL, Symbol.SG, Symbol.SX, Symbol.SK, Symbol.SI, Symbol.SB, Symbol.SO, Symbol.ZA, Symbol.GS, Symbol.KR, Symbol.SS, Symbol.ES, Symbol.LK, Symbol.SD, Symbol.SR, Symbol.SJ, Symbol.SZ, Symbol.SE, Symbol.CH, Symbol.SY, Symbol.TW, Symbol.TJ, Symbol.TZ, Symbol.TH, Symbol.TG, Symbol.TK, Symbol.TO, Symbol.TT, Symbol.TN, Symbol.TR, Symbol.TM, Symbol.TC, Symbol.TV, Symbol.VI, Symbol.UG, Symbol.UA, Symbol.AE, Symbol.GB, Symbol.US, Symbol.UM, Symbol.UY, Symbol.UZ, Symbol.VU, Symbol.VA, Symbol.VE, Symbol.VN, Symbol.WF, Symbol.EH, Symbol.YE, Symbol.ZM, Symbol.ZW, Symbol.BV, Symbol.IC, Symbol.CP, Symbol.TF, Symbol.HM, Symbol.DG, Symbol.EA, Symbol.TA);
            }

            public final Symbol init(String rawValue) {
                rawValue.getClass();
                int hashCode = rawValue.hashCode();
                if (hashCode != 2091) {
                    if (hashCode != 2092) {
                        if (hashCode != 2102) {
                            if (hashCode != 2103) {
                                if (hashCode != 2111) {
                                    if (hashCode != 2112) {
                                        if (hashCode != 2132) {
                                            if (hashCode != 2133) {
                                                if (hashCode != 2135) {
                                                    if (hashCode != 2136) {
                                                        switch (hashCode) {
                                                            case 2082:
                                                                if (rawValue.equals("AC")) {
                                                                    return Symbol.AC;
                                                                }
                                                                return null;
                                                            case 2083:
                                                                if (rawValue.equals("AD")) {
                                                                    return Symbol.AD;
                                                                }
                                                                return null;
                                                            case 2084:
                                                                if (rawValue.equals("AE")) {
                                                                    return Symbol.AE;
                                                                }
                                                                return null;
                                                            case 2085:
                                                                if (rawValue.equals("AF")) {
                                                                    return Symbol.AF;
                                                                }
                                                                return null;
                                                            case 2086:
                                                                if (rawValue.equals("AG")) {
                                                                    return Symbol.AG;
                                                                }
                                                                return null;
                                                            default:
                                                                switch (hashCode) {
                                                                    case 2088:
                                                                        if (rawValue.equals("AI")) {
                                                                            return Symbol.AI;
                                                                        }
                                                                        return null;
                                                                    case 2094:
                                                                        if (rawValue.equals("AO")) {
                                                                            return Symbol.AO;
                                                                        }
                                                                        return null;
                                                                    case 2105:
                                                                        if (rawValue.equals("AZ")) {
                                                                            return Symbol.AZ;
                                                                        }
                                                                        return null;
                                                                    case 2114:
                                                                        if (rawValue.equals("BD")) {
                                                                            return Symbol.BD;
                                                                        }
                                                                        return null;
                                                                    case 2115:
                                                                        if (rawValue.equals("BE")) {
                                                                            return Symbol.BE;
                                                                        }
                                                                        return null;
                                                                    case 2116:
                                                                        if (rawValue.equals("BF")) {
                                                                            return Symbol.BF;
                                                                        }
                                                                        return null;
                                                                    case 2117:
                                                                        if (rawValue.equals("BG")) {
                                                                            return Symbol.BG;
                                                                        }
                                                                        return null;
                                                                    case 2118:
                                                                        if (rawValue.equals("BH")) {
                                                                            return Symbol.BH;
                                                                        }
                                                                        return null;
                                                                    case 2119:
                                                                        if (rawValue.equals("BI")) {
                                                                            return Symbol.BI;
                                                                        }
                                                                        return null;
                                                                    case 2120:
                                                                        if (rawValue.equals("BJ")) {
                                                                            return Symbol.BJ;
                                                                        }
                                                                        return null;
                                                                    case 2142:
                                                                        if (rawValue.equals("CA")) {
                                                                            return Symbol.CA;
                                                                        }
                                                                        return null;
                                                                    case 2144:
                                                                        if (rawValue.equals("CC")) {
                                                                            return Symbol.CC;
                                                                        }
                                                                        return null;
                                                                    case 2145:
                                                                        if (rawValue.equals("CD")) {
                                                                            return Symbol.CD;
                                                                        }
                                                                        return null;
                                                                    case 2147:
                                                                        if (rawValue.equals("CF")) {
                                                                            return Symbol.CF;
                                                                        }
                                                                        return null;
                                                                    case 2148:
                                                                        if (rawValue.equals("CG")) {
                                                                            return Symbol.CG;
                                                                        }
                                                                        return null;
                                                                    case 2149:
                                                                        if (rawValue.equals("CH")) {
                                                                            return Symbol.CH;
                                                                        }
                                                                        return null;
                                                                    case 2150:
                                                                        if (rawValue.equals("CI")) {
                                                                            return Symbol.CI;
                                                                        }
                                                                        return null;
                                                                    case 2152:
                                                                        if (rawValue.equals("CK")) {
                                                                            return Symbol.CK;
                                                                        }
                                                                        return null;
                                                                    case 2153:
                                                                        if (rawValue.equals("CL")) {
                                                                            return Symbol.CL;
                                                                        }
                                                                        return null;
                                                                    case 2154:
                                                                        if (rawValue.equals("CM")) {
                                                                            return Symbol.CM;
                                                                        }
                                                                        return null;
                                                                    case 2155:
                                                                        if (rawValue.equals("CN")) {
                                                                            return Symbol.CN;
                                                                        }
                                                                        return null;
                                                                    case 2156:
                                                                        if (rawValue.equals("CO")) {
                                                                            return Symbol.CO;
                                                                        }
                                                                        return null;
                                                                    case 2157:
                                                                        if (rawValue.equals("CP")) {
                                                                            return Symbol.CP;
                                                                        }
                                                                        return null;
                                                                    case 2159:
                                                                        if (rawValue.equals("CR")) {
                                                                            return Symbol.CR;
                                                                        }
                                                                        return null;
                                                                    case 2162:
                                                                        if (rawValue.equals("CU")) {
                                                                            return Symbol.CU;
                                                                        }
                                                                        return null;
                                                                    case 2163:
                                                                        if (rawValue.equals("CV")) {
                                                                            return Symbol.CV;
                                                                        }
                                                                        return null;
                                                                    case 2164:
                                                                        if (rawValue.equals("CW")) {
                                                                            return Symbol.CW;
                                                                        }
                                                                        return null;
                                                                    case 2165:
                                                                        if (rawValue.equals("CX")) {
                                                                            return Symbol.CX;
                                                                        }
                                                                        return null;
                                                                    case 2166:
                                                                        if (rawValue.equals("CY")) {
                                                                            return Symbol.CY;
                                                                        }
                                                                        return null;
                                                                    case 2167:
                                                                        if (rawValue.equals("CZ")) {
                                                                            return Symbol.CZ;
                                                                        }
                                                                        return null;
                                                                    case 2177:
                                                                        if (rawValue.equals("DE")) {
                                                                            return Symbol.DE;
                                                                        }
                                                                        return null;
                                                                    case 2179:
                                                                        if (rawValue.equals("DG")) {
                                                                            return Symbol.DG;
                                                                        }
                                                                        return null;
                                                                    case 2182:
                                                                        if (rawValue.equals("DJ")) {
                                                                            return Symbol.DJ;
                                                                        }
                                                                        return null;
                                                                    case 2183:
                                                                        if (rawValue.equals("DK")) {
                                                                            return Symbol.DK;
                                                                        }
                                                                        return null;
                                                                    case 2185:
                                                                        if (rawValue.equals("DM")) {
                                                                            return Symbol.DM;
                                                                        }
                                                                        return null;
                                                                    case 2187:
                                                                        if (rawValue.equals("DO")) {
                                                                            return Symbol.DO;
                                                                        }
                                                                        return null;
                                                                    case 2198:
                                                                        if (rawValue.equals("DZ")) {
                                                                            return Symbol.DZ;
                                                                        }
                                                                        return null;
                                                                    case 2204:
                                                                        if (rawValue.equals("EA")) {
                                                                            return Symbol.EA;
                                                                        }
                                                                        return null;
                                                                    case 2206:
                                                                        if (rawValue.equals("EC")) {
                                                                            return Symbol.EC;
                                                                        }
                                                                        return null;
                                                                    case 2208:
                                                                        if (rawValue.equals("EE")) {
                                                                            return Symbol.EE;
                                                                        }
                                                                        return null;
                                                                    case 2210:
                                                                        if (rawValue.equals("EG")) {
                                                                            return Symbol.EG;
                                                                        }
                                                                        return null;
                                                                    case 2211:
                                                                        if (rawValue.equals("EH")) {
                                                                            return Symbol.EH;
                                                                        }
                                                                        return null;
                                                                    case 2221:
                                                                        if (rawValue.equals("ER")) {
                                                                            return Symbol.ER;
                                                                        }
                                                                        return null;
                                                                    case 2222:
                                                                        if (rawValue.equals("ES")) {
                                                                            return Symbol.ES;
                                                                        }
                                                                        return null;
                                                                    case 2223:
                                                                        if (rawValue.equals("ET")) {
                                                                            return Symbol.ET;
                                                                        }
                                                                        return null;
                                                                    case 2243:
                                                                        if (rawValue.equals("FI")) {
                                                                            return Symbol.FI;
                                                                        }
                                                                        return null;
                                                                    case 2244:
                                                                        if (rawValue.equals("FJ")) {
                                                                            return Symbol.FJ;
                                                                        }
                                                                        return null;
                                                                    case 2245:
                                                                        if (rawValue.equals("FK")) {
                                                                            return Symbol.FK;
                                                                        }
                                                                        return null;
                                                                    case 2247:
                                                                        if (rawValue.equals("FM")) {
                                                                            return Symbol.FM;
                                                                        }
                                                                        return null;
                                                                    case 2249:
                                                                        if (rawValue.equals("FO")) {
                                                                            return Symbol.FO;
                                                                        }
                                                                        return null;
                                                                    case 2252:
                                                                        if (rawValue.equals("FR")) {
                                                                            return Symbol.FR;
                                                                        }
                                                                        return null;
                                                                    case 2266:
                                                                        if (rawValue.equals("GA")) {
                                                                            return Symbol.GA;
                                                                        }
                                                                        return null;
                                                                    case 2267:
                                                                        if (rawValue.equals("GB")) {
                                                                            return Symbol.GB;
                                                                        }
                                                                        return null;
                                                                    case 2269:
                                                                        if (rawValue.equals("GD")) {
                                                                            return Symbol.GD;
                                                                        }
                                                                        return null;
                                                                    case 2270:
                                                                        if (rawValue.equals("GE")) {
                                                                            return Symbol.GE;
                                                                        }
                                                                        return null;
                                                                    case 2271:
                                                                        if (rawValue.equals("GF")) {
                                                                            return Symbol.GF;
                                                                        }
                                                                        return null;
                                                                    case 2272:
                                                                        if (rawValue.equals("GG")) {
                                                                            return Symbol.GG;
                                                                        }
                                                                        return null;
                                                                    case 2273:
                                                                        if (rawValue.equals("GH")) {
                                                                            return Symbol.GH;
                                                                        }
                                                                        return null;
                                                                    case 2274:
                                                                        if (rawValue.equals("GI")) {
                                                                            return Symbol.GI;
                                                                        }
                                                                        return null;
                                                                    case 2277:
                                                                        if (rawValue.equals("GL")) {
                                                                            return Symbol.GL;
                                                                        }
                                                                        return null;
                                                                    case 2278:
                                                                        if (rawValue.equals("GM")) {
                                                                            return Symbol.GM;
                                                                        }
                                                                        return null;
                                                                    case 2279:
                                                                        if (rawValue.equals("GN")) {
                                                                            return Symbol.GN;
                                                                        }
                                                                        return null;
                                                                    case 2281:
                                                                        if (rawValue.equals("GP")) {
                                                                            return Symbol.GP;
                                                                        }
                                                                        return null;
                                                                    case 2282:
                                                                        if (rawValue.equals("GQ")) {
                                                                            return Symbol.GQ;
                                                                        }
                                                                        return null;
                                                                    case 2283:
                                                                        if (rawValue.equals("GR")) {
                                                                            return Symbol.GR;
                                                                        }
                                                                        return null;
                                                                    case 2284:
                                                                        if (rawValue.equals("GS")) {
                                                                            return Symbol.GS;
                                                                        }
                                                                        return null;
                                                                    case 2285:
                                                                        if (rawValue.equals("GT")) {
                                                                            return Symbol.GT;
                                                                        }
                                                                        return null;
                                                                    case 2286:
                                                                        if (rawValue.equals("GU")) {
                                                                            return Symbol.GU;
                                                                        }
                                                                        return null;
                                                                    case 2288:
                                                                        if (rawValue.equals("GW")) {
                                                                            return Symbol.GW;
                                                                        }
                                                                        return null;
                                                                    case 2290:
                                                                        if (rawValue.equals("GY")) {
                                                                            return Symbol.GY;
                                                                        }
                                                                        return null;
                                                                    case 2307:
                                                                        if (rawValue.equals("HK")) {
                                                                            return Symbol.HK;
                                                                        }
                                                                        return null;
                                                                    case 2309:
                                                                        if (rawValue.equals("HM")) {
                                                                            return Symbol.HM;
                                                                        }
                                                                        return null;
                                                                    case 2310:
                                                                        if (rawValue.equals("HN")) {
                                                                            return Symbol.HN;
                                                                        }
                                                                        return null;
                                                                    case 2314:
                                                                        if (rawValue.equals("HR")) {
                                                                            return Symbol.HR;
                                                                        }
                                                                        return null;
                                                                    case 2316:
                                                                        if (rawValue.equals("HT")) {
                                                                            return Symbol.HT;
                                                                        }
                                                                        return null;
                                                                    case 2317:
                                                                        if (rawValue.equals("HU")) {
                                                                            return Symbol.HU;
                                                                        }
                                                                        return null;
                                                                    case 2330:
                                                                        if (rawValue.equals("IC")) {
                                                                            return Symbol.IC;
                                                                        }
                                                                        return null;
                                                                    case 2331:
                                                                        if (rawValue.equals("ID")) {
                                                                            return Symbol.ID;
                                                                        }
                                                                        return null;
                                                                    case 2332:
                                                                        if (rawValue.equals("IE")) {
                                                                            return Symbol.IE;
                                                                        }
                                                                        return null;
                                                                    case 2339:
                                                                        if (rawValue.equals("IL")) {
                                                                            return Symbol.IL;
                                                                        }
                                                                        return null;
                                                                    case 2340:
                                                                        if (rawValue.equals("IM")) {
                                                                            return Symbol.IM;
                                                                        }
                                                                        return null;
                                                                    case 2341:
                                                                        if (rawValue.equals("IN")) {
                                                                            return Symbol.IN;
                                                                        }
                                                                        return null;
                                                                    case 2342:
                                                                        if (rawValue.equals("IO")) {
                                                                            return Symbol.IO;
                                                                        }
                                                                        return null;
                                                                    case 2344:
                                                                        if (rawValue.equals("IQ")) {
                                                                            return Symbol.IQ;
                                                                        }
                                                                        return null;
                                                                    case 2345:
                                                                        if (rawValue.equals("IR")) {
                                                                            return Symbol.IR;
                                                                        }
                                                                        return null;
                                                                    case 2346:
                                                                        if (rawValue.equals("IS")) {
                                                                            return Symbol.IS;
                                                                        }
                                                                        return null;
                                                                    case 2347:
                                                                        if (rawValue.equals("IT")) {
                                                                            return Symbol.IT;
                                                                        }
                                                                        return null;
                                                                    case 2363:
                                                                        if (rawValue.equals("JE")) {
                                                                            return Symbol.JE;
                                                                        }
                                                                        return null;
                                                                    case 2371:
                                                                        if (rawValue.equals("JM")) {
                                                                            return Symbol.JM;
                                                                        }
                                                                        return null;
                                                                    case 2373:
                                                                        if (rawValue.equals("JO")) {
                                                                            return Symbol.JO;
                                                                        }
                                                                        return null;
                                                                    case 2374:
                                                                        if (rawValue.equals("JP")) {
                                                                            return Symbol.JP;
                                                                        }
                                                                        return null;
                                                                    case 2394:
                                                                        if (rawValue.equals("KE")) {
                                                                            return Symbol.KE;
                                                                        }
                                                                        return null;
                                                                    case 2396:
                                                                        if (rawValue.equals("KG")) {
                                                                            return Symbol.KG;
                                                                        }
                                                                        return null;
                                                                    case 2397:
                                                                        if (rawValue.equals("KH")) {
                                                                            return Symbol.KH;
                                                                        }
                                                                        return null;
                                                                    case 2398:
                                                                        if (rawValue.equals("KI")) {
                                                                            return Symbol.KI;
                                                                        }
                                                                        return null;
                                                                    case 2402:
                                                                        if (rawValue.equals("KM")) {
                                                                            return Symbol.KM;
                                                                        }
                                                                        return null;
                                                                    case 2403:
                                                                        if (rawValue.equals("KN")) {
                                                                            return Symbol.KN;
                                                                        }
                                                                        return null;
                                                                    case 2405:
                                                                        if (rawValue.equals("KP")) {
                                                                            return Symbol.KP;
                                                                        }
                                                                        return null;
                                                                    case 2407:
                                                                        if (rawValue.equals("KR")) {
                                                                            return Symbol.KR;
                                                                        }
                                                                        return null;
                                                                    case 2412:
                                                                        if (rawValue.equals("KW")) {
                                                                            return Symbol.KW;
                                                                        }
                                                                        return null;
                                                                    case 2414:
                                                                        if (rawValue.equals("KY")) {
                                                                            return Symbol.KY;
                                                                        }
                                                                        return null;
                                                                    case 2415:
                                                                        if (rawValue.equals("KZ")) {
                                                                            return Symbol.KZ;
                                                                        }
                                                                        return null;
                                                                    case 2421:
                                                                        if (rawValue.equals("LA")) {
                                                                            return Symbol.LA;
                                                                        }
                                                                        return null;
                                                                    case 2422:
                                                                        if (rawValue.equals("LB")) {
                                                                            return Symbol.LB;
                                                                        }
                                                                        return null;
                                                                    case 2423:
                                                                        if (rawValue.equals("LC")) {
                                                                            return Symbol.LC;
                                                                        }
                                                                        return null;
                                                                    case 2429:
                                                                        if (rawValue.equals("LI")) {
                                                                            return Symbol.LI;
                                                                        }
                                                                        return null;
                                                                    case 2431:
                                                                        if (rawValue.equals("LK")) {
                                                                            return Symbol.LK;
                                                                        }
                                                                        return null;
                                                                    case 2438:
                                                                        if (rawValue.equals("LR")) {
                                                                            return Symbol.LR;
                                                                        }
                                                                        return null;
                                                                    case 2439:
                                                                        if (rawValue.equals("LS")) {
                                                                            return Symbol.LS;
                                                                        }
                                                                        return null;
                                                                    case 2440:
                                                                        if (rawValue.equals("LT")) {
                                                                            return Symbol.LT;
                                                                        }
                                                                        return null;
                                                                    case 2441:
                                                                        if (rawValue.equals("LU")) {
                                                                            return Symbol.LU;
                                                                        }
                                                                        return null;
                                                                    case 2442:
                                                                        if (rawValue.equals("LV")) {
                                                                            return Symbol.LV;
                                                                        }
                                                                        return null;
                                                                    case 2445:
                                                                        if (rawValue.equals("LY")) {
                                                                            return Symbol.LY;
                                                                        }
                                                                        return null;
                                                                    case 2452:
                                                                        if (rawValue.equals("MA")) {
                                                                            return Symbol.MA;
                                                                        }
                                                                        return null;
                                                                    case 2454:
                                                                        if (rawValue.equals("MC")) {
                                                                            return Symbol.MC;
                                                                        }
                                                                        return null;
                                                                    case 2455:
                                                                        if (rawValue.equals("MD")) {
                                                                            return Symbol.MD;
                                                                        }
                                                                        return null;
                                                                    case 2456:
                                                                        if (rawValue.equals("ME")) {
                                                                            return Symbol.ME;
                                                                        }
                                                                        return null;
                                                                    case 2457:
                                                                        if (rawValue.equals("MF")) {
                                                                            return Symbol.MF;
                                                                        }
                                                                        return null;
                                                                    case 2458:
                                                                        if (rawValue.equals("MG")) {
                                                                            return Symbol.MG;
                                                                        }
                                                                        return null;
                                                                    case 2459:
                                                                        if (rawValue.equals("MH")) {
                                                                            return Symbol.MH;
                                                                        }
                                                                        return null;
                                                                    case 2462:
                                                                        if (rawValue.equals("MK")) {
                                                                            return Symbol.MK;
                                                                        }
                                                                        return null;
                                                                    case 2463:
                                                                        if (rawValue.equals("ML")) {
                                                                            return Symbol.ML;
                                                                        }
                                                                        return null;
                                                                    case 2464:
                                                                        if (rawValue.equals("MM")) {
                                                                            return Symbol.MM;
                                                                        }
                                                                        return null;
                                                                    case 2465:
                                                                        if (rawValue.equals("MN")) {
                                                                            return Symbol.MN;
                                                                        }
                                                                        return null;
                                                                    case 2466:
                                                                        if (rawValue.equals("MO")) {
                                                                            return Symbol.MO;
                                                                        }
                                                                        return null;
                                                                    case 2467:
                                                                        if (rawValue.equals("MP")) {
                                                                            return Symbol.MP;
                                                                        }
                                                                        return null;
                                                                    case 2468:
                                                                        if (rawValue.equals("MQ")) {
                                                                            return Symbol.MQ;
                                                                        }
                                                                        return null;
                                                                    case 2469:
                                                                        if (rawValue.equals("MR")) {
                                                                            return Symbol.MR;
                                                                        }
                                                                        return null;
                                                                    case 2470:
                                                                        if (rawValue.equals("MS")) {
                                                                            return Symbol.MS;
                                                                        }
                                                                        return null;
                                                                    case 2471:
                                                                        if (rawValue.equals("MT")) {
                                                                            return Symbol.MT;
                                                                        }
                                                                        return null;
                                                                    case 2472:
                                                                        if (rawValue.equals("MU")) {
                                                                            return Symbol.MU;
                                                                        }
                                                                        return null;
                                                                    case 2473:
                                                                        if (rawValue.equals("MV")) {
                                                                            return Symbol.MV;
                                                                        }
                                                                        return null;
                                                                    case 2474:
                                                                        if (rawValue.equals("MW")) {
                                                                            return Symbol.MW;
                                                                        }
                                                                        return null;
                                                                    case 2475:
                                                                        if (rawValue.equals("MX")) {
                                                                            return Symbol.MX;
                                                                        }
                                                                        return null;
                                                                    case 2476:
                                                                        if (rawValue.equals("MY")) {
                                                                            return Symbol.MY;
                                                                        }
                                                                        return null;
                                                                    case 2477:
                                                                        if (rawValue.equals("MZ")) {
                                                                            return Symbol.MZ;
                                                                        }
                                                                        return null;
                                                                    case 2483:
                                                                        if (rawValue.equals("NA")) {
                                                                            return Symbol.NA;
                                                                        }
                                                                        return null;
                                                                    case 2485:
                                                                        if (rawValue.equals("NC")) {
                                                                            return Symbol.NC;
                                                                        }
                                                                        return null;
                                                                    case 2487:
                                                                        if (rawValue.equals("NE")) {
                                                                            return Symbol.NE;
                                                                        }
                                                                        return null;
                                                                    case 2488:
                                                                        if (rawValue.equals("NF")) {
                                                                            return Symbol.NF;
                                                                        }
                                                                        return null;
                                                                    case 2489:
                                                                        if (rawValue.equals("NG")) {
                                                                            return Symbol.NG;
                                                                        }
                                                                        return null;
                                                                    case 2491:
                                                                        if (rawValue.equals("NI")) {
                                                                            return Symbol.NI;
                                                                        }
                                                                        return null;
                                                                    case 2494:
                                                                        if (rawValue.equals("NL")) {
                                                                            return Symbol.NL;
                                                                        }
                                                                        return null;
                                                                    case 2497:
                                                                        if (rawValue.equals("NO")) {
                                                                            return Symbol.NO;
                                                                        }
                                                                        return null;
                                                                    case 2498:
                                                                        if (rawValue.equals("NP")) {
                                                                            return Symbol.NP;
                                                                        }
                                                                        return null;
                                                                    case 2500:
                                                                        if (rawValue.equals("NR")) {
                                                                            return Symbol.NR;
                                                                        }
                                                                        return null;
                                                                    case 2503:
                                                                        if (rawValue.equals("NU")) {
                                                                            return Symbol.NU;
                                                                        }
                                                                        return null;
                                                                    case 2508:
                                                                        if (rawValue.equals("NZ")) {
                                                                            return Symbol.NZ;
                                                                        }
                                                                        return null;
                                                                    case 2526:
                                                                        if (rawValue.equals("OM")) {
                                                                            return Symbol.OM;
                                                                        }
                                                                        return null;
                                                                    case 2545:
                                                                        if (rawValue.equals("PA")) {
                                                                            return Symbol.PA;
                                                                        }
                                                                        return null;
                                                                    case 2549:
                                                                        if (rawValue.equals("PE")) {
                                                                            return Symbol.PE;
                                                                        }
                                                                        return null;
                                                                    case 2550:
                                                                        if (rawValue.equals("PF")) {
                                                                            return Symbol.PF;
                                                                        }
                                                                        return null;
                                                                    case 2551:
                                                                        if (rawValue.equals("PG")) {
                                                                            return Symbol.PG;
                                                                        }
                                                                        return null;
                                                                    case 2552:
                                                                        if (rawValue.equals("PH")) {
                                                                            return Symbol.PH;
                                                                        }
                                                                        return null;
                                                                    case 2555:
                                                                        if (rawValue.equals("PK")) {
                                                                            return Symbol.PK;
                                                                        }
                                                                        return null;
                                                                    case 2556:
                                                                        if (rawValue.equals("PL")) {
                                                                            return Symbol.PL;
                                                                        }
                                                                        return null;
                                                                    case 2557:
                                                                        if (rawValue.equals("PM")) {
                                                                            return Symbol.PM;
                                                                        }
                                                                        return null;
                                                                    case 2558:
                                                                        if (rawValue.equals("PN")) {
                                                                            return Symbol.PN;
                                                                        }
                                                                        return null;
                                                                    case 2562:
                                                                        if (rawValue.equals("PR")) {
                                                                            return Symbol.PR;
                                                                        }
                                                                        return null;
                                                                    case 2563:
                                                                        if (rawValue.equals("PS")) {
                                                                            return Symbol.PS;
                                                                        }
                                                                        return null;
                                                                    case 2564:
                                                                        if (rawValue.equals("PT")) {
                                                                            return Symbol.PT;
                                                                        }
                                                                        return null;
                                                                    case 2567:
                                                                        if (rawValue.equals("PW")) {
                                                                            return Symbol.PW;
                                                                        }
                                                                        return null;
                                                                    case 2569:
                                                                        if (rawValue.equals("PY")) {
                                                                            return Symbol.PY;
                                                                        }
                                                                        return null;
                                                                    case 2576:
                                                                        if (rawValue.equals("QA")) {
                                                                            return Symbol.QA;
                                                                        }
                                                                        return null;
                                                                    case 2611:
                                                                        if (rawValue.equals("RE")) {
                                                                            return Symbol.RE;
                                                                        }
                                                                        return null;
                                                                    case 2621:
                                                                        if (rawValue.equals("RO")) {
                                                                            return Symbol.RO;
                                                                        }
                                                                        return null;
                                                                    case 2625:
                                                                        if (rawValue.equals("RS")) {
                                                                            return Symbol.RS;
                                                                        }
                                                                        return null;
                                                                    case 2627:
                                                                        if (rawValue.equals("RU")) {
                                                                            return Symbol.RU;
                                                                        }
                                                                        return null;
                                                                    case 2629:
                                                                        if (rawValue.equals("RW")) {
                                                                            return Symbol.RW;
                                                                        }
                                                                        return null;
                                                                    case 2638:
                                                                        if (rawValue.equals("SA")) {
                                                                            return Symbol.SA;
                                                                        }
                                                                        return null;
                                                                    case 2639:
                                                                        if (rawValue.equals("SB")) {
                                                                            return Symbol.SB;
                                                                        }
                                                                        return null;
                                                                    case 2640:
                                                                        if (rawValue.equals("SC")) {
                                                                            return Symbol.SC;
                                                                        }
                                                                        return null;
                                                                    case 2641:
                                                                        if (rawValue.equals("SD")) {
                                                                            return Symbol.SD;
                                                                        }
                                                                        return null;
                                                                    case 2642:
                                                                        if (rawValue.equals("SE")) {
                                                                            return Symbol.SE;
                                                                        }
                                                                        return null;
                                                                    case 2644:
                                                                        if (rawValue.equals("SG")) {
                                                                            return Symbol.SG;
                                                                        }
                                                                        return null;
                                                                    case 2645:
                                                                        if (rawValue.equals("SH")) {
                                                                            return Symbol.SH;
                                                                        }
                                                                        return null;
                                                                    case 2646:
                                                                        if (rawValue.equals("SI")) {
                                                                            return Symbol.SI;
                                                                        }
                                                                        return null;
                                                                    case 2647:
                                                                        if (rawValue.equals("SJ")) {
                                                                            return Symbol.SJ;
                                                                        }
                                                                        return null;
                                                                    case 2648:
                                                                        if (rawValue.equals("SK")) {
                                                                            return Symbol.SK;
                                                                        }
                                                                        return null;
                                                                    case 2649:
                                                                        if (rawValue.equals("SL")) {
                                                                            return Symbol.SL;
                                                                        }
                                                                        return null;
                                                                    case 2650:
                                                                        if (rawValue.equals("SM")) {
                                                                            return Symbol.SM;
                                                                        }
                                                                        return null;
                                                                    case 2651:
                                                                        if (rawValue.equals("SN")) {
                                                                            return Symbol.SN;
                                                                        }
                                                                        return null;
                                                                    case 2652:
                                                                        if (rawValue.equals("SO")) {
                                                                            return Symbol.SO;
                                                                        }
                                                                        return null;
                                                                    case 2655:
                                                                        if (rawValue.equals("SR")) {
                                                                            return Symbol.SR;
                                                                        }
                                                                        return null;
                                                                    case 2656:
                                                                        if (rawValue.equals("SS")) {
                                                                            return Symbol.SS;
                                                                        }
                                                                        return null;
                                                                    case 2657:
                                                                        if (rawValue.equals("ST")) {
                                                                            return Symbol.ST;
                                                                        }
                                                                        return null;
                                                                    case 2659:
                                                                        if (rawValue.equals("SV")) {
                                                                            return Symbol.SV;
                                                                        }
                                                                        return null;
                                                                    case 2661:
                                                                        if (rawValue.equals("SX")) {
                                                                            return Symbol.SX;
                                                                        }
                                                                        return null;
                                                                    case 2662:
                                                                        if (rawValue.equals("SY")) {
                                                                            return Symbol.SY;
                                                                        }
                                                                        return null;
                                                                    case 2663:
                                                                        if (rawValue.equals("SZ")) {
                                                                            return Symbol.SZ;
                                                                        }
                                                                        return null;
                                                                    case 2669:
                                                                        if (rawValue.equals("TA")) {
                                                                            return Symbol.TA;
                                                                        }
                                                                        return null;
                                                                    case 2671:
                                                                        if (rawValue.equals("TC")) {
                                                                            return Symbol.TC;
                                                                        }
                                                                        return null;
                                                                    case 2672:
                                                                        if (rawValue.equals("TD")) {
                                                                            return Symbol.TD;
                                                                        }
                                                                        return null;
                                                                    case 2674:
                                                                        if (rawValue.equals("TF")) {
                                                                            return Symbol.TF;
                                                                        }
                                                                        return null;
                                                                    case 2675:
                                                                        if (rawValue.equals("TG")) {
                                                                            return Symbol.TG;
                                                                        }
                                                                        return null;
                                                                    case 2676:
                                                                        if (rawValue.equals("TH")) {
                                                                            return Symbol.TH;
                                                                        }
                                                                        return null;
                                                                    case 2678:
                                                                        if (rawValue.equals("TJ")) {
                                                                            return Symbol.TJ;
                                                                        }
                                                                        return null;
                                                                    case 2679:
                                                                        if (rawValue.equals("TK")) {
                                                                            return Symbol.TK;
                                                                        }
                                                                        return null;
                                                                    case 2680:
                                                                        if (rawValue.equals("TL")) {
                                                                            return Symbol.TL;
                                                                        }
                                                                        return null;
                                                                    case 2681:
                                                                        if (rawValue.equals("TM")) {
                                                                            return Symbol.TM;
                                                                        }
                                                                        return null;
                                                                    case 2682:
                                                                        if (rawValue.equals("TN")) {
                                                                            return Symbol.TN;
                                                                        }
                                                                        return null;
                                                                    case 2683:
                                                                        if (rawValue.equals("TO")) {
                                                                            return Symbol.TO;
                                                                        }
                                                                        return null;
                                                                    case 2686:
                                                                        if (rawValue.equals("TR")) {
                                                                            return Symbol.TR;
                                                                        }
                                                                        return null;
                                                                    case 2688:
                                                                        if (rawValue.equals("TT")) {
                                                                            return Symbol.TT;
                                                                        }
                                                                        return null;
                                                                    case 2690:
                                                                        if (rawValue.equals("TV")) {
                                                                            return Symbol.TV;
                                                                        }
                                                                        return null;
                                                                    case 2691:
                                                                        if (rawValue.equals("TW")) {
                                                                            return Symbol.TW;
                                                                        }
                                                                        return null;
                                                                    case 2694:
                                                                        if (rawValue.equals("TZ")) {
                                                                            return Symbol.TZ;
                                                                        }
                                                                        return null;
                                                                    case 2700:
                                                                        if (rawValue.equals("UA")) {
                                                                            return Symbol.UA;
                                                                        }
                                                                        return null;
                                                                    case 2706:
                                                                        if (rawValue.equals("UG")) {
                                                                            return Symbol.UG;
                                                                        }
                                                                        return null;
                                                                    case 2712:
                                                                        if (rawValue.equals("UM")) {
                                                                            return Symbol.UM;
                                                                        }
                                                                        return null;
                                                                    case 2718:
                                                                        if (rawValue.equals("US")) {
                                                                            return Symbol.US;
                                                                        }
                                                                        return null;
                                                                    case 2724:
                                                                        if (rawValue.equals("UY")) {
                                                                            return Symbol.UY;
                                                                        }
                                                                        return null;
                                                                    case 2725:
                                                                        if (rawValue.equals("UZ")) {
                                                                            return Symbol.UZ;
                                                                        }
                                                                        return null;
                                                                    case 2731:
                                                                        if (rawValue.equals("VA")) {
                                                                            return Symbol.VA;
                                                                        }
                                                                        return null;
                                                                    case 2733:
                                                                        if (rawValue.equals("VC")) {
                                                                            return Symbol.VC;
                                                                        }
                                                                        return null;
                                                                    case 2735:
                                                                        if (rawValue.equals("VE")) {
                                                                            return Symbol.VE;
                                                                        }
                                                                        return null;
                                                                    case 2737:
                                                                        if (rawValue.equals("VG")) {
                                                                            return Symbol.VG;
                                                                        }
                                                                        return null;
                                                                    case 2739:
                                                                        if (rawValue.equals("VI")) {
                                                                            return Symbol.VI;
                                                                        }
                                                                        return null;
                                                                    case 2744:
                                                                        if (rawValue.equals("VN")) {
                                                                            return Symbol.VN;
                                                                        }
                                                                        return null;
                                                                    case 2751:
                                                                        if (rawValue.equals("VU")) {
                                                                            return Symbol.VU;
                                                                        }
                                                                        return null;
                                                                    case 2767:
                                                                        if (rawValue.equals("WF")) {
                                                                            return Symbol.WF;
                                                                        }
                                                                        return null;
                                                                    case 2780:
                                                                        if (rawValue.equals("WS")) {
                                                                            return Symbol.WS;
                                                                        }
                                                                        return null;
                                                                    case 2803:
                                                                        if (rawValue.equals("XK")) {
                                                                            return Symbol.XK;
                                                                        }
                                                                        return null;
                                                                    case 2828:
                                                                        if (rawValue.equals("YE")) {
                                                                            return Symbol.YE;
                                                                        }
                                                                        return null;
                                                                    case 2843:
                                                                        if (rawValue.equals("YT")) {
                                                                            return Symbol.YT;
                                                                        }
                                                                        return null;
                                                                    case 2855:
                                                                        if (rawValue.equals("ZA")) {
                                                                            return Symbol.ZA;
                                                                        }
                                                                        return null;
                                                                    case 2867:
                                                                        if (rawValue.equals("ZM")) {
                                                                            return Symbol.ZM;
                                                                        }
                                                                        return null;
                                                                    case 2877:
                                                                        if (rawValue.equals("ZW")) {
                                                                            return Symbol.ZW;
                                                                        }
                                                                        return null;
                                                                    default:
                                                                        switch (hashCode) {
                                                                            case 2096:
                                                                                if (rawValue.equals("AQ")) {
                                                                                    return Symbol.AQ;
                                                                                }
                                                                                return null;
                                                                            case 2097:
                                                                                if (rawValue.equals("AR")) {
                                                                                    return Symbol.AR;
                                                                                }
                                                                                return null;
                                                                            case 2098:
                                                                                if (rawValue.equals("AS")) {
                                                                                    return Symbol.AS;
                                                                                }
                                                                                return null;
                                                                            case 2099:
                                                                                if (rawValue.equals("AT")) {
                                                                                    return Symbol.AT;
                                                                                }
                                                                                return null;
                                                                            case 2100:
                                                                                if (rawValue.equals("AU")) {
                                                                                    return Symbol.AU;
                                                                                }
                                                                                return null;
                                                                            default:
                                                                                switch (hashCode) {
                                                                                    case 2122:
                                                                                        if (rawValue.equals("BL")) {
                                                                                            return Symbol.BL;
                                                                                        }
                                                                                        return null;
                                                                                    case 2123:
                                                                                        if (rawValue.equals("BM")) {
                                                                                            return Symbol.BM;
                                                                                        }
                                                                                        return null;
                                                                                    case 2124:
                                                                                        if (rawValue.equals("BN")) {
                                                                                            return Symbol.BN;
                                                                                        }
                                                                                        return null;
                                                                                    case 2125:
                                                                                        if (rawValue.equals("BO")) {
                                                                                            return Symbol.BO;
                                                                                        }
                                                                                        return null;
                                                                                    default:
                                                                                        switch (hashCode) {
                                                                                            case 2127:
                                                                                                if (rawValue.equals("BQ")) {
                                                                                                    return Symbol.BQ;
                                                                                                }
                                                                                                return null;
                                                                                            case 2128:
                                                                                                if (rawValue.equals("BR")) {
                                                                                                    return Symbol.BR;
                                                                                                }
                                                                                                return null;
                                                                                            case 2129:
                                                                                                if (rawValue.equals("BS")) {
                                                                                                    return Symbol.BS;
                                                                                                }
                                                                                                return null;
                                                                                            case 2130:
                                                                                                if (rawValue.equals("BT")) {
                                                                                                    return Symbol.BT;
                                                                                                }
                                                                                                return null;
                                                                                            default:
                                                                                                return null;
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                    }
                                                    if (rawValue.equals("BZ")) {
                                                        return Symbol.BZ;
                                                    }
                                                    return null;
                                                }
                                                if (rawValue.equals("BY")) {
                                                    return Symbol.BY;
                                                }
                                                return null;
                                            }
                                            if (rawValue.equals("BW")) {
                                                return Symbol.BW;
                                            }
                                            return null;
                                        }
                                        if (rawValue.equals("BV")) {
                                            return Symbol.BV;
                                        }
                                        return null;
                                    }
                                    if (rawValue.equals("BB")) {
                                        return Symbol.BB;
                                    }
                                    return null;
                                }
                                if (rawValue.equals("BA")) {
                                    return Symbol.BA;
                                }
                                return null;
                            }
                            if (rawValue.equals("AX")) {
                                return Symbol.AX;
                            }
                            return null;
                        }
                        if (rawValue.equals("AW")) {
                            return Symbol.AW;
                        }
                        return null;
                    }
                    if (rawValue.equals("AM")) {
                        return Symbol.AM;
                    }
                    return null;
                }
                if (!rawValue.equals("AL")) {
                    return null;
                }
                return Symbol.AL;
            }

            private Companion() {
            }
        }

        @Override // skip.lib.RawRepresentable
        public String getRawValue() {
            return this.rawValue;
        }

        private Symbol(String str, int i, String str2, Void r4) {
            this.rawValue = str2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006J\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006H\u0082 J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0082 J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/polymarket/data/ECountry$Companion;", "", "<init>", "()V", "symbol", "Lcom/polymarket/data/ECountry;", "Lcom/polymarket/data/ECountry$Symbol;", "Swift_Companion_symbol_0", "allSorted", "", "getAllSorted", "()Ljava/util/List;", "Swift_Companion_allSorted", "Symbol", "rawValue", "", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native List<ECountry> Swift_Companion_allSorted();

        private final native ECountry Swift_Companion_symbol_0(Symbol symbol);

        public final Symbol Symbol(String rawValue) {
            rawValue.getClass();
            return Symbol.INSTANCE.init(rawValue);
        }

        public final List<ECountry> getAllSorted() {
            return Swift_Companion_allSorted();
        }

        public final ECountry symbol(Symbol symbol) {
            symbol.getClass();
            return Swift_Companion_symbol_0(symbol);
        }

        private Companion() {
        }
    }

    @Override // skip.lib.Identifiable
    public /* bridge */ /* synthetic */ String getId() {
        return getId2();
    }

    public ECountry(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001EB\u001f\b\u0016\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB3\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u00110\u0010¢\u0006\u0004\b\t\u0010\u0012B\u0011\b\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0014J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0015\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\f\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\u000eH\u0016J\u0015\u0010&\u001a\u00020\f2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010'\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010(\u001a\u00020\fH\u0082 J\u0015\u0010-\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J\u001d\u0010.\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010(\u001a\u00020\u000eH\u0082 J'\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u00110\u00102\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0082 J/\u00104\u001a\u00020\u001a2\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0018\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u00110\u0010H\u0082 J7\u00105\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u00110\u0010H\u0082 J\u0015\u00106\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0013\u001a\u00020\u0001H\u0082 J\b\u0010@\u001a\u00020\u0001H\u0016J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001f0B2\u0006\u0010C\u001a\u00020\u000eH\u0016J\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001f0B2\u0006\u0010C\u001a\u00020\u000eH\u0082 R\u001e\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,RH\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u00110\u00102\u0018\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\u00110\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R(\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a\u0018\u000108X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010*\"\u0004\b?\u0010,¨\u0006F"}, d2 = {"Lcom/polymarket/data/ECountry$Format;", "Lskip/lib/MutableStruct;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "prefix", "", "length", "", "spacers", "", "Lkotlin/Pair;", "(Ljava/lang/String;ILjava/util/List;)V", "copy", "(Lskip/lib/MutableStruct;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "newValue", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "Swift_prefix", "Swift_prefix_set", "value", "getLength", "()I", "setLength", "(I)V", "Swift_length", "Swift_length_set", "getSpacers", "()Ljava/util/List;", "setSpacers", "(Ljava/util/List;)V", "Swift_spacers", "Swift_spacers_set", "Swift_constructor_0", "Swift_constructor_1", "supdate", "Lkotlin/Function1;", "getSupdate", "()Lkotlin/jvm/functions/Function1;", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Format implements MutableStruct, SwiftPeerBridged, SwiftProjecting {
        private long Swift_peer;
        private int smutatingcount;
        private Function1<Object, Unit> supdate;

        public Format(String str, int i, List<Pair<Integer, String>> list) {
            str.getClass();
            list.getClass();
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_0(str, i, list);
        }

        private final native long Swift_constructor_0(String prefix, int length, List<Pair<Integer, String>> spacers);

        private final native long Swift_constructor_1(MutableStruct copy);

        private final native int Swift_length(long Swift_peer);

        private final native void Swift_length_set(long Swift_peer, int value);

        private final native String Swift_prefix(long Swift_peer);

        private final native void Swift_prefix_set(long Swift_peer, String value);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native void Swift_release(long Swift_peer);

        private final native List<Pair<Integer, String>> Swift_spacers(long Swift_peer);

        private final native void Swift_spacers_set(long Swift_peer, List<Pair<Integer, String>> value);

        @Override // skip.bridge.SwiftPeerBridged
        /* renamed from: Swift_peer, reason: from getter */
        public long getSwift_peer() {
            return this.Swift_peer;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        @Override // skip.lib.MutableStruct
        public void didmutate() {
            super.didmutate();
        }

        public boolean equals(Object other) {
            if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
                return false;
            }
            return true;
        }

        public final void finalize() {
            Swift_release(this.Swift_peer);
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        }

        public final int getLength() {
            return Swift_length(this.Swift_peer);
        }

        public final String getPrefix() {
            return Swift_prefix(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public int getSmutatingcount() {
            return this.smutatingcount;
        }

        public final List<Pair<Integer, String>> getSpacers() {
            return Swift_spacers(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public Function1<Object, Unit> getSupdate() {
            return this.supdate;
        }

        public final long getSwift_peer() {
            return this.Swift_peer;
        }

        public int hashCode() {
            return Long.hashCode(this.Swift_peer);
        }

        @Override // skip.lib.MutableStruct
        public MutableStruct scopy() {
            return new Format(this);
        }

        public final void setLength(int i) {
            willmutate();
            try {
                Swift_length_set(this.Swift_peer, i);
            } finally {
                didmutate();
            }
        }

        public final void setPrefix(String str) {
            str.getClass();
            willmutate();
            try {
                Swift_prefix_set(this.Swift_peer, str);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSmutatingcount(int i) {
            this.smutatingcount = i;
        }

        public final void setSpacers(List<Pair<Integer, String>> list) {
            list.getClass();
            List<Pair<Integer, String>> list2 = (List) StructKt.sref$default(list, null, 1, null);
            willmutate();
            try {
                Swift_spacers_set(this.Swift_peer, list2);
            } finally {
                didmutate();
            }
        }

        @Override // skip.lib.MutableStruct
        public void setSupdate(Function1<Object, Unit> function1) {
            this.supdate = function1;
        }

        public final void setSwift_peer(long j) {
            this.Swift_peer = j;
        }

        @Override // skip.lib.MutableStruct
        public void willmutate() {
            super.willmutate();
        }

        public Format(long j, SwiftPeerMarker swiftPeerMarker) {
            BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = j;
        }

        private Format(MutableStruct mutableStruct) {
            this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
            this.Swift_peer = Swift_constructor_1(mutableStruct);
        }
    }
}
