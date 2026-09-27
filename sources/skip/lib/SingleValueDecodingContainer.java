package skip.lib;

import defpackage.hkj;
import defpackage.vsj;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\n\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\n\u0010\rJ\u001d\u0010\n\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0016¢\u0006\u0004\b\n\u0010\u000fJ\u001d\u0010\n\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0016¢\u0006\u0004\b\n\u0010\u0011J\u001d\u0010\n\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u0016¢\u0006\u0004\b\n\u0010\u0013J\u001d\u0010\n\u001a\u00020\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\u0016¢\u0006\u0004\b\n\u0010\u0015J\u001d\u0010\n\u001a\u00020\u00162\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00160\bH\u0016¢\u0006\u0004\b\n\u0010\u0017J\u001d\u0010\n\u001a\u00020\u00182\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u0016¢\u0006\u0004\b\n\u0010\u0019J\u001d\u0010\n\u001a\u00020\u001a2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001a0\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u001d\u0010\n\u001a\u00020\u001c2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001c0\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u001d\u0010\n\u001a\u00020\u001e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001e0\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0017J\u001d\u0010\n\u001a\u00020 2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020 0\bH\u0016¢\u0006\u0004\b!\u0010\u0019J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010#*\u00020\"2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010$J-\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\b\b\u0000\u0010&*\u00020%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-JB\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000/\"\n\b\u0000\u0010.\u0018\u0001*\u00020\"2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0\b2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\b¢\u0006\u0004\b\n\u00101JB\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u000002\"\n\b\u0000\u0010.\u0018\u0001*\u00020\"2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003020\b2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\b¢\u0006\u0004\b\n\u00103JZ\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000/0/\"\n\b\u0000\u0010.\u0018\u0001*\u00020\"2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0\b2\u0010\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0\b2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\b¢\u0006\u0004\b\n\u00105Jf\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000108\"\n\b\u0000\u00106\u0018\u0001*\u00020\"\"\n\b\u0001\u00107\u0018\u0001*\u00020\"2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003080\b2\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0086\b¢\u0006\u0004\b\n\u0010;J~\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010/08\"\n\b\u0000\u00106\u0018\u0001*\u00020\"\"\n\b\u0001\u0010.\u0018\u0001*\u00020\"2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003080\b2\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0010\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030/0\b2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0086\b¢\u0006\u0004\b\n\u0010<R\u0014\u0010=\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020%0/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lskip/lib/SingleValueDecodingContainer;", "Lskip/lib/SingleValueDecodingContainerProtocol;", "container", "<init>", "(Lskip/lib/SingleValueDecodingContainerProtocol;)V", "", "decodeNil", "()Z", "Lkotlin/reflect/KClass;", "type", "decode", "(Lkotlin/reflect/KClass;)Z", "", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "", "(Lkotlin/reflect/KClass;)D", "", "(Lkotlin/reflect/KClass;)F", "", "(Lkotlin/reflect/KClass;)B", "", "(Lkotlin/reflect/KClass;)S", "", "(Lkotlin/reflect/KClass;)I", "", "(Lkotlin/reflect/KClass;)J", "Lkotlin/UByte;", "decode-Wa3L5BU", "Lvsj;", "decode-BwKQO78", "Lkotlin/UInt;", "decode-OGnWXxg", "Lhkj;", "decode-I7RO_PI", "", "T", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Lskip/lib/CodingKey;", "NestedKey", "keyedBy", "Lskip/lib/KeyedDecodingContainer;", "nestedContainer", "(Lkotlin/reflect/KClass;)Lskip/lib/KeyedDecodingContainer;", "Lskip/lib/UnkeyedDecodingContainer;", "nestedUnkeyedContainer", "()Lskip/lib/UnkeyedDecodingContainer;", "E", "Lskip/lib/Array;", "elementType", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Lskip/lib/Array;", "", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Ljava/util/Set;", "nestedElementType", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Lskip/lib/Array;", "K", "V", "Lskip/lib/Dictionary;", "keyType", "valueType", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Lskip/lib/Dictionary;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Lskip/lib/Dictionary;", "box", "Lskip/lib/SingleValueDecodingContainerProtocol;", "getCodingPath", "()Lskip/lib/Array;", "codingPath", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SingleValueDecodingContainer implements SingleValueDecodingContainerProtocol {
    private final SingleValueDecodingContainerProtocol box;

    public SingleValueDecodingContainer(SingleValueDecodingContainerProtocol singleValueDecodingContainerProtocol) {
        singleValueDecodingContainerProtocol.getClass();
        this.box = singleValueDecodingContainerProtocol;
    }

    public final <E> Array<Array<E>> decode(KClass<Array<?>> type, KClass<Array<?>> elementType, KClass<E> nestedElementType) {
        type.getClass();
        elementType.getClass();
        nestedElementType.getClass();
        UnkeyedDecodingContainer nestedUnkeyedContainer = nestedUnkeyedContainer();
        ArrayList arrayList = new ArrayList();
        if (nestedUnkeyedContainer.isAtEnd()) {
            return new Array<>((Iterable) arrayList, true, false, 4, (DefaultConstructorMarker) null);
        }
        nestedUnkeyedContainer.nestedUnkeyedContainer();
        Intrinsics.h();
        throw null;
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    /* renamed from: decode-BwKQO78 */
    public short mo1174decodeBwKQO78(KClass<vsj> type) {
        type.getClass();
        return this.box.mo1174decodeBwKQO78(type);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    /* renamed from: decode-I7RO_PI */
    public long mo1175decodeI7RO_PI(KClass<hkj> type) {
        type.getClass();
        return this.box.mo1175decodeI7RO_PI(type);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    /* renamed from: decode-OGnWXxg */
    public int mo1176decodeOGnWXxg(KClass<UInt> type) {
        type.getClass();
        return this.box.mo1176decodeOGnWXxg(type);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    /* renamed from: decode-Wa3L5BU */
    public byte mo1177decodeWa3L5BU(KClass<UByte> type) {
        type.getClass();
        return this.box.mo1177decodeWa3L5BU(type);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    public boolean decodeNil() {
        return this.box.decodeNil();
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    public Array<CodingKey> getCodingPath() {
        return this.box.getCodingPath();
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    public <NestedKey extends CodingKey> KeyedDecodingContainer<NestedKey> nestedContainer(KClass<NestedKey> keyedBy) {
        keyedBy.getClass();
        return this.box.nestedContainer(keyedBy);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    public UnkeyedDecodingContainer nestedUnkeyedContainer() {
        return this.box.nestedUnkeyedContainer();
    }

    public final <K, E> Dictionary<K, Array<E>> decode(KClass<Dictionary<?, ?>> type, KClass<K> keyType, KClass<Array<?>> valueType, KClass<E> nestedElementType) {
        type.getClass();
        keyType.getClass();
        valueType.getClass();
        nestedElementType.getClass();
        Intrinsics.h();
        throw null;
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    /* renamed from: decode */
    public boolean mo1185decode(KClass<Boolean> type) {
        type.getClass();
        return this.box.mo1185decode(type);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    /* renamed from: decode */
    public String mo1183decode(KClass<String> type) {
        type.getClass();
        return this.box.mo1183decode(type);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    /* renamed from: decode */
    public double mo1178decode(KClass<Double> type) {
        type.getClass();
        return this.box.mo1178decode(type);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    /* renamed from: decode */
    public float mo1179decode(KClass<Float> type) {
        type.getClass();
        return this.box.mo1179decode(type);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    public byte decode(KClass<Byte> type) {
        type.getClass();
        return this.box.decode(type);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    /* renamed from: decode */
    public short mo1184decode(KClass<Short> type) {
        type.getClass();
        return this.box.mo1184decode(type);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    /* renamed from: decode */
    public int mo1180decode(KClass<Integer> type) {
        type.getClass();
        return this.box.mo1180decode(type);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    /* renamed from: decode */
    public long mo1181decode(KClass<Long> type) {
        type.getClass();
        return this.box.mo1181decode(type);
    }

    @Override // skip.lib.SingleValueDecodingContainerProtocol
    /* renamed from: decode */
    public <T> T mo1182decode(KClass<T> type) {
        type.getClass();
        return (T) this.box.mo1182decode(type);
    }

    /* renamed from: decode, reason: collision with other method in class */
    public final <E> Array<E> m1360decode(KClass<Array<?>> type, KClass<E> elementType) {
        type.getClass();
        elementType.getClass();
        nestedUnkeyedContainer();
        Intrinsics.h();
        throw null;
    }

    public final <E> java.util.Set<E> decode(KClass<java.util.Set<?>> type, KClass<E> elementType) {
        type.getClass();
        elementType.getClass();
        nestedUnkeyedContainer();
        Intrinsics.h();
        throw null;
    }

    /* renamed from: decode, reason: collision with other method in class */
    public final <K, V> Dictionary<K, V> m1361decode(KClass<Dictionary<?, ?>> type, KClass<K> keyType, KClass<V> valueType) {
        type.getClass();
        keyType.getClass();
        valueType.getClass();
        Intrinsics.h();
        throw null;
    }
}
