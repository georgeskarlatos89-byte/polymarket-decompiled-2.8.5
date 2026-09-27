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
import skip.lib.CodingKey;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\nJ%\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u000f\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J%\u0010\u000f\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J%\u0010\u000f\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0016J%\u0010\u000f\u001a\u00020\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0018J%\u0010\u000f\u001a\u00020\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00190\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u001aJ%\u0010\u000f\u001a\u00020\u001b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001b0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u001cJ%\u0010\u000f\u001a\u00020\u001d2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u001eJ%\u0010\u000f\u001a\u00020\u001f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001f0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b \u0010\u0018J%\u0010\u000f\u001a\u00020!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020!0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\"\u0010\u001aJ%\u0010\u000f\u001a\u00020#2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020#0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b$\u0010\u001cJ%\u0010\u000f\u001a\u00020%2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020%0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b&\u0010\u001eJ/\u0010\u000f\u001a\u00028\u0001\"\b\b\u0001\u0010(*\u00020'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010)J'\u0010*\u001a\u0004\u0018\u00010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u0010+J'\u0010*\u001a\u0004\u0018\u00010\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00110\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u0010\u0012J'\u0010*\u001a\u0004\u0018\u00010\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u0010,J'\u0010*\u001a\u0004\u0018\u00010\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u0010-J'\u0010*\u001a\u0004\u0018\u00010\u00172\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u0010.J'\u0010*\u001a\u0004\u0018\u00010\u00192\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00190\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u0010/J'\u0010*\u001a\u0004\u0018\u00010\u001b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001b0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u00100J'\u0010*\u001a\u0004\u0018\u00010\u001d2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u00101J'\u0010*\u001a\u0004\u0018\u00010\u001f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001f0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b2\u00103J'\u0010*\u001a\u0004\u0018\u00010!2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020!0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b4\u00105J'\u0010*\u001a\u0004\u0018\u00010#2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020#0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b6\u00107J'\u0010*\u001a\u0004\u0018\u00010%2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020%0\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b8\u00109J1\u0010*\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010(*\u00020'2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b*\u0010)J5\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010:*\u00020\u00012\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020>2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010B\u001a\u00020A2\u0006\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\bB\u0010DJJ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010F\"\n\b\u0001\u0010E\u0018\u0001*\u00020'2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030F0\r2\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010HJL\u0010*\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010F\"\n\b\u0001\u0010E\u0018\u0001*\u00020'2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030F0\r2\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b*\u0010HJJ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010I\"\n\b\u0001\u0010E\u0018\u0001*\u00020'2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030I0\r2\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010JJL\u0010*\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010I\"\n\b\u0001\u0010E\u0018\u0001*\u00020'2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030I0\r2\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b*\u0010JJb\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010F0F\"\n\b\u0001\u0010E\u0018\u0001*\u00020'2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030F0\r2\u0010\u0010G\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030F0\r2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010LJd\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010F\u0018\u00010F\"\n\b\u0001\u0010E\u0018\u0001*\u00020'2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030F0\r2\u0010\u0010G\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030F0\r2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b*\u0010LJn\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020O\"\n\b\u0001\u0010M\u0018\u0001*\u00020'\"\n\b\u0002\u0010N\u0018\u0001*\u00020'2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030O0\r2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010RJp\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010O\"\n\b\u0001\u0010M\u0018\u0001*\u00020'\"\n\b\u0002\u0010N\u0018\u0001*\u00020'2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030O0\r2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b*\u0010RJ\u0086\u0001\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020F0O\"\n\b\u0001\u0010M\u0018\u0001*\u00020'\"\n\b\u0002\u0010E\u0018\u0001*\u00020'2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030O0\r2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0010\u0010Q\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030F0\r2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000f\u0010SJ\u0088\u0001\u0010*\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020F\u0018\u00010O\"\n\b\u0001\u0010M\u0018\u0001*\u00020'\"\n\b\u0002\u0010E\u0018\u0001*\u00020'2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030O0\r2\f\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0010\u0010Q\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030F0\r2\f\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b*\u0010SR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00010F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00010F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010W¨\u0006["}, d2 = {"Lskip/lib/KeyedDecodingContainer;", "Lskip/lib/CodingKey;", "Key", "Lskip/lib/KeyedDecodingContainerProtocol;", "container", "<init>", "(Lskip/lib/KeyedDecodingContainerProtocol;)V", "key", "", "contains", "(Lskip/lib/CodingKey;)Z", "forKey", "decodeNil", "Lkotlin/reflect/KClass;", "type", "decode", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Z", "", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Ljava/lang/String;", "", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)D", "", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)F", "", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)B", "", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)S", "", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)I", "", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)J", "Lkotlin/UByte;", "decode-Iymvxus", "Lvsj;", "decode-ErzVvmY", "Lkotlin/UInt;", "decode-xfHcF5w", "Lhkj;", "decode-ZIaKswc", "", "T", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Ljava/lang/Object;", "decodeIfPresent", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Ljava/lang/Boolean;", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Ljava/lang/Double;", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Ljava/lang/Float;", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Ljava/lang/Byte;", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Ljava/lang/Short;", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Ljava/lang/Integer;", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Ljava/lang/Long;", "decodeIfPresent-lj4SQcc", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Lkotlin/UByte;", "decodeIfPresent-QDdqv-c", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Lvsj;", "decodeIfPresent-uT2Fmlo", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Lkotlin/UInt;", "decodeIfPresent-woJcscw", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Lhkj;", "NestedKey", "keyedBy", "nestedContainer", "(Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Lskip/lib/KeyedDecodingContainer;", "Lskip/lib/UnkeyedDecodingContainer;", "nestedUnkeyedContainer", "(Lskip/lib/CodingKey;)Lskip/lib/UnkeyedDecodingContainer;", "Lskip/lib/Decoder;", "superDecoder", "()Lskip/lib/Decoder;", "(Lskip/lib/CodingKey;)Lskip/lib/Decoder;", "E", "Lskip/lib/Array;", "elementType", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Lskip/lib/Array;", "Lskip/lib/Set;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Lskip/lib/Set;", "nestedElementType", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Lskip/lib/Array;", "K", "V", "Lskip/lib/Dictionary;", "keyType", "valueType", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Lskip/lib/Dictionary;", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lskip/lib/CodingKey;)Lskip/lib/Dictionary;", "box", "Lskip/lib/KeyedDecodingContainerProtocol;", "getCodingPath", "()Lskip/lib/Array;", "codingPath", "getAllKeys", "allKeys", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KeyedDecodingContainer<Key extends CodingKey> implements KeyedDecodingContainerProtocol<CodingKey> {
    private final KeyedDecodingContainerProtocol<CodingKey> box;

    public KeyedDecodingContainer(KeyedDecodingContainerProtocol<CodingKey> keyedDecodingContainerProtocol) {
        keyedDecodingContainerProtocol.getClass();
        this.box = keyedDecodingContainerProtocol;
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    public boolean contains(CodingKey key) {
        key.getClass();
        return this.box.contains(key);
    }

    public final <E> Array<Array<E>> decode(KClass<Array<?>> type, KClass<Array<?>> elementType, KClass<E> nestedElementType, CodingKey forKey) {
        type.getClass();
        elementType.getClass();
        nestedElementType.getClass();
        forKey.getClass();
        UnkeyedDecodingContainer nestedUnkeyedContainer = nestedUnkeyedContainer(forKey);
        ArrayList arrayList = new ArrayList();
        if (nestedUnkeyedContainer.isAtEnd()) {
            return new Array<>((Iterable) arrayList, true, false, 4, (DefaultConstructorMarker) null);
        }
        nestedUnkeyedContainer.nestedUnkeyedContainer();
        Intrinsics.h();
        throw null;
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decode-ErzVvmY */
    public short mo1138decodeErzVvmY(KClass<vsj> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1138decodeErzVvmY(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decode-Iymvxus */
    public byte mo1139decodeIymvxus(KClass<UByte> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1139decodeIymvxus(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decode-ZIaKswc */
    public long mo1140decodeZIaKswc(KClass<hkj> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1140decodeZIaKswc(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decode-xfHcF5w */
    public int mo1141decodexfHcF5w(KClass<UInt> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1141decodexfHcF5w(type, forKey);
    }

    public final <E> Array<Array<E>> decodeIfPresent(KClass<Array<?>> type, KClass<Array<?>> elementType, KClass<E> nestedElementType, CodingKey forKey) {
        type.getClass();
        elementType.getClass();
        nestedElementType.getClass();
        forKey.getClass();
        if (!contains(forKey) || decodeNil(forKey)) {
            return null;
        }
        UnkeyedDecodingContainer nestedUnkeyedContainer = nestedUnkeyedContainer(forKey);
        ArrayList arrayList = new ArrayList();
        if (nestedUnkeyedContainer.isAtEnd()) {
            return new Array<>((Iterable) arrayList, true, false, 4, (DefaultConstructorMarker) null);
        }
        nestedUnkeyedContainer.nestedUnkeyedContainer();
        Intrinsics.h();
        throw null;
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent-QDdqv-c */
    public vsj mo1142decodeIfPresentQDdqvc(KClass<vsj> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1142decodeIfPresentQDdqvc(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent-lj4SQcc */
    public UByte mo1143decodeIfPresentlj4SQcc(KClass<UByte> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1143decodeIfPresentlj4SQcc(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent-uT2Fmlo */
    public UInt mo1144decodeIfPresentuT2Fmlo(KClass<UInt> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1144decodeIfPresentuT2Fmlo(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent-woJcscw */
    public hkj mo1145decodeIfPresentwoJcscw(KClass<hkj> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1145decodeIfPresentwoJcscw(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    public boolean decodeNil(CodingKey forKey) {
        forKey.getClass();
        return this.box.decodeNil(forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    public Array<CodingKey> getAllKeys() {
        return this.box.getAllKeys();
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    public Array<CodingKey> getCodingPath() {
        return this.box.getCodingPath();
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    public <NestedKey extends CodingKey> KeyedDecodingContainer<NestedKey> nestedContainer(KClass<NestedKey> keyedBy, CodingKey forKey) {
        keyedBy.getClass();
        forKey.getClass();
        return this.box.nestedContainer(keyedBy, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    public UnkeyedDecodingContainer nestedUnkeyedContainer(CodingKey forKey) {
        forKey.getClass();
        return this.box.nestedUnkeyedContainer(forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    public Decoder superDecoder(CodingKey forKey) {
        forKey.getClass();
        return this.box.superDecoder(forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    public Decoder superDecoder() {
        return this.box.superDecoder();
    }

    /* renamed from: decode, reason: collision with other method in class */
    public final <K, V> Dictionary<K, V> m1279decode(KClass<Dictionary<?, ?>> type, KClass<K> keyType, KClass<V> valueType, CodingKey forKey) {
        type.getClass();
        keyType.getClass();
        valueType.getClass();
        forKey.getClass();
        Intrinsics.h();
        throw null;
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decode */
    public boolean mo1153decode(KClass<Boolean> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1153decode(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decode */
    public String mo1151decode(KClass<String> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1151decode(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decode */
    public double mo1146decode(KClass<Double> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1146decode(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decode */
    public float mo1147decode(KClass<Float> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1147decode(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    public byte decode(KClass<Byte> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.decode(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decode */
    public short mo1152decode(KClass<Short> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1152decode(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decode */
    public int mo1148decode(KClass<Integer> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1148decode(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decode */
    public long mo1149decode(KClass<Long> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1149decode(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decode */
    public <T> T mo1150decode(KClass<T> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return (T) this.box.mo1150decode(type, forKey);
    }

    public final <E> Array<E> decode(KClass<Array<?>> type, KClass<E> elementType, CodingKey forKey) {
        type.getClass();
        elementType.getClass();
        forKey.getClass();
        nestedUnkeyedContainer(forKey);
        Intrinsics.h();
        throw null;
    }

    /* renamed from: decode, reason: collision with other method in class */
    public final <E> Set<E> m1280decode(KClass<Set<?>> type, KClass<E> elementType, CodingKey forKey) {
        type.getClass();
        elementType.getClass();
        forKey.getClass();
        nestedUnkeyedContainer(forKey);
        Intrinsics.h();
        throw null;
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public String mo1161decodeIfPresent(KClass<String> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1161decodeIfPresent(type, forKey);
    }

    public final <K, E> Dictionary<K, Array<E>> decode(KClass<Dictionary<?, ?>> type, KClass<K> keyType, KClass<Array<?>> valueType, KClass<E> nestedElementType, CodingKey forKey) {
        type.getClass();
        keyType.getClass();
        valueType.getClass();
        nestedElementType.getClass();
        forKey.getClass();
        Intrinsics.h();
        throw null;
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public Double mo1155decodeIfPresent(KClass<Double> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1155decodeIfPresent(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public Float mo1156decodeIfPresent(KClass<Float> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1156decodeIfPresent(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public Byte mo1154decodeIfPresent(KClass<Byte> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1154decodeIfPresent(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public Short mo1160decodeIfPresent(KClass<Short> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1160decodeIfPresent(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public Integer mo1157decodeIfPresent(KClass<Integer> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1157decodeIfPresent(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public Long mo1158decodeIfPresent(KClass<Long> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.mo1158decodeIfPresent(type, forKey);
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    /* renamed from: decodeIfPresent */
    public <T> T mo1159decodeIfPresent(KClass<T> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return (T) this.box.mo1159decodeIfPresent(type, forKey);
    }

    public final <E> Array<E> decodeIfPresent(KClass<Array<?>> type, KClass<E> elementType, CodingKey forKey) {
        type.getClass();
        elementType.getClass();
        forKey.getClass();
        if (!contains(forKey) || decodeNil(forKey)) {
            return null;
        }
        nestedUnkeyedContainer(forKey);
        Intrinsics.h();
        throw null;
    }

    /* renamed from: decodeIfPresent, reason: collision with other method in class */
    public final <E> Set<E> m1282decodeIfPresent(KClass<Set<?>> type, KClass<E> elementType, CodingKey forKey) {
        type.getClass();
        elementType.getClass();
        forKey.getClass();
        if (!contains(forKey) || decodeNil(forKey)) {
            return null;
        }
        nestedUnkeyedContainer(forKey);
        Intrinsics.h();
        throw null;
    }

    @Override // skip.lib.KeyedDecodingContainerProtocol
    public Boolean decodeIfPresent(KClass<Boolean> type, CodingKey forKey) {
        type.getClass();
        forKey.getClass();
        return this.box.decodeIfPresent(type, forKey);
    }

    /* renamed from: decodeIfPresent, reason: collision with other method in class */
    public final <K, V> Dictionary<K, V> m1281decodeIfPresent(KClass<Dictionary<?, ?>> type, KClass<K> keyType, KClass<V> valueType, CodingKey forKey) {
        type.getClass();
        keyType.getClass();
        valueType.getClass();
        forKey.getClass();
        if (!contains(forKey) || decodeNil(forKey)) {
            return null;
        }
        Intrinsics.h();
        throw null;
    }

    public final <K, E> Dictionary<K, Array<E>> decodeIfPresent(KClass<Dictionary<?, ?>> type, KClass<K> keyType, KClass<Array<?>> valueType, KClass<E> nestedElementType, CodingKey forKey) {
        type.getClass();
        keyType.getClass();
        valueType.getClass();
        nestedElementType.getClass();
        forKey.getClass();
        if (!contains(forKey) || decodeNil(forKey)) {
            return null;
        }
        Intrinsics.h();
        throw null;
    }
}
