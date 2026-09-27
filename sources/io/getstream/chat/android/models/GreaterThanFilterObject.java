package io.getstream.chat.android.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\"\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÀ\u0001¢\u0006\u0002\b\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/getstream/chat/android/models/GreaterThanFilterObject;", "Lio/getstream/chat/android/models/FilterObject;", "fieldName", "", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getFieldName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "copy$stream_chat_android_core", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GreaterThanFilterObject extends FilterObject {
    private final String fieldName;
    private final Object value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GreaterThanFilterObject(String str, Object obj) {
        super(null);
        str.getClass();
        obj.getClass();
        this.fieldName = str;
        this.value = obj;
    }

    public static /* synthetic */ GreaterThanFilterObject copy$stream_chat_android_core$default(GreaterThanFilterObject greaterThanFilterObject, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = greaterThanFilterObject.fieldName;
        }
        if ((i & 2) != 0) {
            obj = greaterThanFilterObject.value;
        }
        return greaterThanFilterObject.copy$stream_chat_android_core(str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final GreaterThanFilterObject copy$stream_chat_android_core(String fieldName, Object value) {
        fieldName.getClass();
        value.getClass();
        return new GreaterThanFilterObject(fieldName, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GreaterThanFilterObject)) {
            return false;
        }
        GreaterThanFilterObject greaterThanFilterObject = (GreaterThanFilterObject) other;
        if (Intrinsics.areEqual(this.fieldName, greaterThanFilterObject.fieldName) && Intrinsics.areEqual(this.value, greaterThanFilterObject.value)) {
            return true;
        }
        return false;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.fieldName.hashCode() * 31);
    }

    public String toString() {
        return "GreaterThanFilterObject(fieldName=" + this.fieldName + ", value=" + this.value + ")";
    }
}
