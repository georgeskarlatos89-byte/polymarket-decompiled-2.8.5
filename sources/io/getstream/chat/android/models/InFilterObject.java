package io.getstream.chat.android.models;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J(\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÀ\u0001¢\u0006\u0002\b\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/getstream/chat/android/models/InFilterObject;", "Lio/getstream/chat/android/models/FilterObject;", "fieldName", "", "values", "", "", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "getFieldName", "()Ljava/lang/String;", "getValues", "()Ljava/util/Set;", "component1", "component2", "copy", "copy$stream_chat_android_core", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InFilterObject extends FilterObject {
    private final String fieldName;
    private final Set<Object> values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InFilterObject(String str, Set<? extends Object> set) {
        super(null);
        str.getClass();
        set.getClass();
        this.fieldName = str;
        this.values = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InFilterObject copy$stream_chat_android_core$default(InFilterObject inFilterObject, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inFilterObject.fieldName;
        }
        if ((i & 2) != 0) {
            set = inFilterObject.values;
        }
        return inFilterObject.copy$stream_chat_android_core(str, set);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }

    public final Set<Object> component2() {
        return this.values;
    }

    public final InFilterObject copy$stream_chat_android_core(String fieldName, Set<? extends Object> values) {
        fieldName.getClass();
        values.getClass();
        return new InFilterObject(fieldName, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InFilterObject)) {
            return false;
        }
        InFilterObject inFilterObject = (InFilterObject) other;
        if (Intrinsics.areEqual(this.fieldName, inFilterObject.fieldName) && Intrinsics.areEqual(this.values, inFilterObject.values)) {
            return true;
        }
        return false;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final Set<Object> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() + (this.fieldName.hashCode() * 31);
    }

    public String toString() {
        return "InFilterObject(fieldName=" + this.fieldName + ", values=" + this.values + ")";
    }
}
