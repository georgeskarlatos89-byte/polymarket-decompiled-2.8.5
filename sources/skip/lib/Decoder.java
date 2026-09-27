package skip.lib;

import kotlin.Metadata;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\b\b\u0000\u0010\u000e*\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lskip/lib/Decoder;", "", "codingPath", "Lskip/lib/Array;", "Lskip/lib/CodingKey;", "getCodingPath", "()Lskip/lib/Array;", "userInfo", "Lskip/lib/Dictionary;", "Lskip/lib/CodingUserInfoKey;", "getUserInfo", "()Lskip/lib/Dictionary;", "container", "Lskip/lib/KeyedDecodingContainer;", "Key", "keyedBy", "Lkotlin/reflect/KClass;", "unkeyedContainer", "Lskip/lib/UnkeyedDecodingContainer;", "singleValueContainer", "Lskip/lib/SingleValueDecodingContainer;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Decoder {
    <Key extends CodingKey> KeyedDecodingContainer<Key> container(KClass<Key> keyedBy);

    Array<CodingKey> getCodingPath();

    Dictionary<CodingUserInfoKey, Object> getUserInfo();

    SingleValueDecodingContainer singleValueContainer();

    UnkeyedDecodingContainer unkeyedContainer();
}
