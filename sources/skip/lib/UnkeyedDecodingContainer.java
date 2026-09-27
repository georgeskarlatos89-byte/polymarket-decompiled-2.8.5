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
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\n\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\n\u0010\rJ\u001d\u0010\n\u001a\u00020\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0016¢\u0006\u0004\b\n\u0010\u000fJ\u001d\u0010\n\u001a\u00020\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0016¢\u0006\u0004\b\n\u0010\u0011J\u001d\u0010\n\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u0016¢\u0006\u0004\b\n\u0010\u0013J\u001d\u0010\n\u001a\u00020\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\u0016¢\u0006\u0004\b\n\u0010\u0015J\u001d\u0010\n\u001a\u00020\u00162\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00160\bH\u0016¢\u0006\u0004\b\n\u0010\u0017J\u001d\u0010\n\u001a\u00020\u00182\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u0016¢\u0006\u0004\b\n\u0010\u0019J\u001d\u0010\n\u001a\u00020\u001a2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001a0\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u001d\u0010\n\u001a\u00020\u001c2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001c0\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u001d\u0010\n\u001a\u00020\u001e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001e0\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0017J\u001d\u0010\n\u001a\u00020 2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020 0\bH\u0016¢\u0006\u0004\b!\u0010\u0019J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010#*\u00020\"2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010$J\u001f\u0010%\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u0004\u0018\u00010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b%\u0010\rJ\u001f\u0010%\u001a\u0004\u0018\u00010\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0016¢\u0006\u0004\b%\u0010'J\u001f\u0010%\u001a\u0004\u0018\u00010\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\bH\u0016¢\u0006\u0004\b%\u0010(J\u001f\u0010%\u001a\u0004\u0018\u00010\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\u0016¢\u0006\u0004\b%\u0010)J\u001f\u0010%\u001a\u0004\u0018\u00010\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\u0016¢\u0006\u0004\b%\u0010*J\u001f\u0010%\u001a\u0004\u0018\u00010\u00162\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00160\bH\u0016¢\u0006\u0004\b%\u0010+J\u001f\u0010%\u001a\u0004\u0018\u00010\u00182\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00180\bH\u0016¢\u0006\u0004\b%\u0010,J\u001f\u0010%\u001a\u0004\u0018\u00010\u001a2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001a0\bH\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010%\u001a\u0004\u0018\u00010\u001c2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001c0\bH\u0016¢\u0006\u0004\b/\u00100J\u001f\u0010%\u001a\u0004\u0018\u00010\u001e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001e0\bH\u0016¢\u0006\u0004\b1\u00102J\u001f\u0010%\u001a\u0004\u0018\u00010 2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020 0\bH\u0016¢\u0006\u0004\b3\u00104J)\u0010%\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010#*\u00020\"2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b%\u0010$J-\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008\"\b\b\u0000\u00106*\u0002052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0000H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?JB\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\n\b\u0000\u0010@\u0018\u0001*\u00020\"2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030A0\b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\b¢\u0006\u0004\b\n\u0010CJD\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010A\"\n\b\u0000\u0010@\u0018\u0001*\u00020\"2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030A0\b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\b¢\u0006\u0004\b%\u0010CJB\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000D\"\n\b\u0000\u0010@\u0018\u0001*\u00020\"2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030D0\b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\b¢\u0006\u0004\b\n\u0010EJD\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010D\"\n\b\u0000\u0010@\u0018\u0001*\u00020\"2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030D0\b2\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\b¢\u0006\u0004\b%\u0010EJZ\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000A0A\"\n\b\u0000\u0010@\u0018\u0001*\u00020\"2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030A0\b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030A0\b2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\b¢\u0006\u0004\b\n\u0010GJ\\\u0010%\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000A\u0018\u00010A\"\n\b\u0000\u0010@\u0018\u0001*\u00020\"2\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030A0\b2\u0010\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030A0\b2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\b¢\u0006\u0004\b%\u0010GJf\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J\"\n\b\u0000\u0010H\u0018\u0001*\u00020\"\"\n\b\u0001\u0010I\u0018\u0001*\u00020\"2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030J0\b2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0086\b¢\u0006\u0004\b\n\u0010MJh\u0010%\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010J\"\n\b\u0000\u0010H\u0018\u0001*\u00020\"\"\n\b\u0001\u0010I\u0018\u0001*\u00020\"2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030J0\b2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0086\b¢\u0006\u0004\b%\u0010MJ~\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010A0J\"\n\b\u0000\u0010H\u0018\u0001*\u00020\"\"\n\b\u0001\u0010@\u0018\u0001*\u00020\"2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030J0\b2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0010\u0010L\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030A0\b2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0086\b¢\u0006\u0004\b\n\u0010NJ\u0080\u0001\u0010%\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010A\u0018\u00010J\"\n\b\u0000\u0010H\u0018\u0001*\u00020\"\"\n\b\u0001\u0010@\u0018\u0001*\u00020\"2\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030J0\b2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0010\u0010L\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030A0\b2\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0086\b¢\u0006\u0004\b%\u0010NR\u0014\u0010O\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u0002050A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0016\u0010V\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0007R\u0014\u0010Z\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"Lskip/lib/UnkeyedDecodingContainer;", "Lskip/lib/UnkeyedDecodingContainerProtocol;", "container", "<init>", "(Lskip/lib/UnkeyedDecodingContainerProtocol;)V", "", "decodeNil", "()Z", "Lkotlin/reflect/KClass;", "type", "decode", "(Lkotlin/reflect/KClass;)Z", "", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "", "(Lkotlin/reflect/KClass;)D", "", "(Lkotlin/reflect/KClass;)F", "", "(Lkotlin/reflect/KClass;)B", "", "(Lkotlin/reflect/KClass;)S", "", "(Lkotlin/reflect/KClass;)I", "", "(Lkotlin/reflect/KClass;)J", "Lkotlin/UByte;", "decode-Wa3L5BU", "Lvsj;", "decode-BwKQO78", "Lkotlin/UInt;", "decode-OGnWXxg", "Lhkj;", "decode-I7RO_PI", "", "T", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "decodeIfPresent", "(Lkotlin/reflect/KClass;)Ljava/lang/Boolean;", "(Lkotlin/reflect/KClass;)Ljava/lang/Double;", "(Lkotlin/reflect/KClass;)Ljava/lang/Float;", "(Lkotlin/reflect/KClass;)Ljava/lang/Byte;", "(Lkotlin/reflect/KClass;)Ljava/lang/Short;", "(Lkotlin/reflect/KClass;)Ljava/lang/Integer;", "(Lkotlin/reflect/KClass;)Ljava/lang/Long;", "decodeIfPresent-do-JOtI", "(Lkotlin/reflect/KClass;)Lkotlin/UByte;", "decodeIfPresent-162jBTc", "(Lkotlin/reflect/KClass;)Lvsj;", "decodeIfPresent-gbq4QnA", "(Lkotlin/reflect/KClass;)Lkotlin/UInt;", "decodeIfPresent-JlBESG8", "(Lkotlin/reflect/KClass;)Lhkj;", "Lskip/lib/CodingKey;", "NestedKey", "keyedBy", "Lskip/lib/KeyedDecodingContainer;", "nestedContainer", "(Lkotlin/reflect/KClass;)Lskip/lib/KeyedDecodingContainer;", "nestedUnkeyedContainer", "()Lskip/lib/UnkeyedDecodingContainer;", "Lskip/lib/Decoder;", "superDecoder", "()Lskip/lib/Decoder;", "E", "Lskip/lib/Array;", "elementType", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Lskip/lib/Array;", "Lskip/lib/Set;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Lskip/lib/Set;", "nestedElementType", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Lskip/lib/Array;", "K", "V", "Lskip/lib/Dictionary;", "keyType", "valueType", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Lskip/lib/Dictionary;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Lskip/lib/Dictionary;", "box", "Lskip/lib/UnkeyedDecodingContainerProtocol;", "getCodingPath", "()Lskip/lib/Array;", "codingPath", "getCount", "()Ljava/lang/Integer;", "count", "isAtEnd", "getCurrentIndex", "()I", "currentIndex", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnkeyedDecodingContainer implements UnkeyedDecodingContainerProtocol {
    private final UnkeyedDecodingContainerProtocol box;

    public UnkeyedDecodingContainer(UnkeyedDecodingContainerProtocol unkeyedDecodingContainerProtocol) {
        unkeyedDecodingContainerProtocol.getClass();
        this.box = unkeyedDecodingContainerProtocol;
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

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decode-BwKQO78 */
    public short mo1190decodeBwKQO78(KClass<vsj> type) {
        type.getClass();
        return this.box.mo1190decodeBwKQO78(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decode-I7RO_PI */
    public long mo1191decodeI7RO_PI(KClass<hkj> type) {
        type.getClass();
        return this.box.mo1191decodeI7RO_PI(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decode-OGnWXxg */
    public int mo1192decodeOGnWXxg(KClass<UInt> type) {
        type.getClass();
        return this.box.mo1192decodeOGnWXxg(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decode-Wa3L5BU */
    public byte mo1193decodeWa3L5BU(KClass<UByte> type) {
        type.getClass();
        return this.box.mo1193decodeWa3L5BU(type);
    }

    public final <E> Array<Array<E>> decodeIfPresent(KClass<Array<?>> type, KClass<Array<?>> elementType, KClass<E> nestedElementType) {
        type.getClass();
        elementType.getClass();
        nestedElementType.getClass();
        if (isAtEnd() || decodeNil()) {
            return null;
        }
        UnkeyedDecodingContainer nestedUnkeyedContainer = nestedUnkeyedContainer();
        ArrayList arrayList = new ArrayList();
        if (nestedUnkeyedContainer.isAtEnd()) {
            return new Array<>((Iterable) arrayList, true, false, 4, (DefaultConstructorMarker) null);
        }
        nestedUnkeyedContainer.nestedUnkeyedContainer();
        Intrinsics.h();
        throw null;
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent-162jBTc */
    public vsj mo1194decodeIfPresent162jBTc(KClass<vsj> type) {
        type.getClass();
        return this.box.mo1194decodeIfPresent162jBTc(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent-JlBESG8 */
    public hkj mo1195decodeIfPresentJlBESG8(KClass<hkj> type) {
        type.getClass();
        return this.box.mo1195decodeIfPresentJlBESG8(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent-do-JOtI */
    public UByte mo1196decodeIfPresentdoJOtI(KClass<UByte> type) {
        type.getClass();
        return this.box.mo1196decodeIfPresentdoJOtI(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent-gbq4QnA */
    public UInt mo1197decodeIfPresentgbq4QnA(KClass<UInt> type) {
        type.getClass();
        return this.box.mo1197decodeIfPresentgbq4QnA(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    public boolean decodeNil() {
        return this.box.decodeNil();
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    public Array<CodingKey> getCodingPath() {
        return this.box.getCodingPath();
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    public Integer getCount() {
        return this.box.getCount();
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    public int getCurrentIndex() {
        return this.box.getCurrentIndex();
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    public boolean isAtEnd() {
        return this.box.isAtEnd();
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    public <NestedKey extends CodingKey> KeyedDecodingContainer<NestedKey> nestedContainer(KClass<NestedKey> keyedBy) {
        keyedBy.getClass();
        return this.box.nestedContainer(keyedBy);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    public UnkeyedDecodingContainer nestedUnkeyedContainer() {
        return this.box.nestedUnkeyedContainer();
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    public Decoder superDecoder() {
        return this.box.superDecoder();
    }

    public final <K, E> Dictionary<K, Array<E>> decode(KClass<Dictionary<?, ?>> type, KClass<K> keyType, KClass<Array<?>> valueType, KClass<E> nestedElementType) {
        type.getClass();
        keyType.getClass();
        valueType.getClass();
        nestedElementType.getClass();
        Intrinsics.h();
        throw null;
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decode */
    public boolean mo1205decode(KClass<Boolean> type) {
        type.getClass();
        return this.box.mo1205decode(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decode */
    public String mo1203decode(KClass<String> type) {
        type.getClass();
        return this.box.mo1203decode(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decode */
    public double mo1198decode(KClass<Double> type) {
        type.getClass();
        return this.box.mo1198decode(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decode */
    public float mo1199decode(KClass<Float> type) {
        type.getClass();
        return this.box.mo1199decode(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    public byte decode(KClass<Byte> type) {
        type.getClass();
        return this.box.decode(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decode */
    public short mo1204decode(KClass<Short> type) {
        type.getClass();
        return this.box.mo1204decode(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decode */
    public int mo1200decode(KClass<Integer> type) {
        type.getClass();
        return this.box.mo1200decode(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decode */
    public long mo1201decode(KClass<Long> type) {
        type.getClass();
        return this.box.mo1201decode(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decode */
    public <T> T mo1202decode(KClass<T> type) {
        type.getClass();
        return (T) this.box.mo1202decode(type);
    }

    public final <E> Array<E> decode(KClass<Array<?>> type, KClass<E> elementType) {
        type.getClass();
        elementType.getClass();
        nestedUnkeyedContainer();
        Intrinsics.h();
        throw null;
    }

    /* renamed from: decode, reason: collision with other method in class */
    public final <E> Set<E> m1367decode(KClass<Set<?>> type, KClass<E> elementType) {
        type.getClass();
        elementType.getClass();
        nestedUnkeyedContainer();
        Intrinsics.h();
        throw null;
    }

    /* renamed from: decode, reason: collision with other method in class */
    public final <K, V> Dictionary<K, V> m1366decode(KClass<Dictionary<?, ?>> type, KClass<K> keyType, KClass<V> valueType) {
        type.getClass();
        keyType.getClass();
        valueType.getClass();
        Intrinsics.h();
        throw null;
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public String mo1213decodeIfPresent(KClass<String> type) {
        type.getClass();
        return this.box.mo1213decodeIfPresent(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public Double mo1207decodeIfPresent(KClass<Double> type) {
        type.getClass();
        return this.box.mo1207decodeIfPresent(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public Float mo1208decodeIfPresent(KClass<Float> type) {
        type.getClass();
        return this.box.mo1208decodeIfPresent(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public Byte mo1206decodeIfPresent(KClass<Byte> type) {
        type.getClass();
        return this.box.mo1206decodeIfPresent(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public Short mo1212decodeIfPresent(KClass<Short> type) {
        type.getClass();
        return this.box.mo1212decodeIfPresent(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public Integer mo1209decodeIfPresent(KClass<Integer> type) {
        type.getClass();
        return this.box.mo1209decodeIfPresent(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public Long mo1210decodeIfPresent(KClass<Long> type) {
        type.getClass();
        return this.box.mo1210decodeIfPresent(type);
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public <T> T mo1211decodeIfPresent(KClass<T> type) {
        type.getClass();
        return (T) this.box.mo1211decodeIfPresent(type);
    }

    public final <E> Array<E> decodeIfPresent(KClass<Array<?>> type, KClass<E> elementType) {
        type.getClass();
        elementType.getClass();
        if (isAtEnd() || decodeNil()) {
            return null;
        }
        nestedUnkeyedContainer();
        Intrinsics.h();
        throw null;
    }

    /* renamed from: decodeIfPresent, reason: collision with other method in class */
    public final <E> Set<E> m1369decodeIfPresent(KClass<Set<?>> type, KClass<E> elementType) {
        type.getClass();
        elementType.getClass();
        if (isAtEnd() || decodeNil()) {
            return null;
        }
        nestedUnkeyedContainer();
        Intrinsics.h();
        throw null;
    }

    @Override // skip.lib.UnkeyedDecodingContainerProtocol
    public Boolean decodeIfPresent(KClass<Boolean> type) {
        type.getClass();
        return this.box.decodeIfPresent(type);
    }

    /* renamed from: decodeIfPresent, reason: collision with other method in class */
    public final <K, V> Dictionary<K, V> m1368decodeIfPresent(KClass<Dictionary<?, ?>> type, KClass<K> keyType, KClass<V> valueType) {
        type.getClass();
        keyType.getClass();
        valueType.getClass();
        if (isAtEnd() || decodeNil()) {
            return null;
        }
        Intrinsics.h();
        throw null;
    }

    public final <K, E> Dictionary<K, Array<E>> decodeIfPresent(KClass<Dictionary<?, ?>> type, KClass<K> keyType, KClass<Array<?>> valueType, KClass<E> nestedElementType) {
        type.getClass();
        keyType.getClass();
        valueType.getClass();
        nestedElementType.getClass();
        if (isAtEnd() || decodeNil()) {
            return null;
        }
        Intrinsics.h();
        throw null;
    }
}
