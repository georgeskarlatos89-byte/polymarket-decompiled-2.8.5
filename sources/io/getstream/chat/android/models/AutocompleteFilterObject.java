package io.getstream.chat.android.models;

import defpackage.hdi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\"\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÀ\u0001¢\u0006\u0002\b\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lio/getstream/chat/android/models/AutocompleteFilterObject;", "Lio/getstream/chat/android/models/FilterObject;", "fieldName", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "copy$stream_chat_android_core", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutocompleteFilterObject extends FilterObject {
    private final String fieldName;
    private final String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutocompleteFilterObject(String str, String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.fieldName = str;
        this.value = str2;
    }

    public static /* synthetic */ AutocompleteFilterObject copy$stream_chat_android_core$default(AutocompleteFilterObject autocompleteFilterObject, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autocompleteFilterObject.fieldName;
        }
        if ((i & 2) != 0) {
            str2 = autocompleteFilterObject.value;
        }
        return autocompleteFilterObject.copy$stream_chat_android_core(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final AutocompleteFilterObject copy$stream_chat_android_core(String fieldName, String value) {
        fieldName.getClass();
        value.getClass();
        return new AutocompleteFilterObject(fieldName, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutocompleteFilterObject)) {
            return false;
        }
        AutocompleteFilterObject autocompleteFilterObject = (AutocompleteFilterObject) other;
        if (Intrinsics.areEqual(this.fieldName, autocompleteFilterObject.fieldName) && Intrinsics.areEqual(this.value, autocompleteFilterObject.value)) {
            return true;
        }
        return false;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.fieldName.hashCode() * 31);
    }

    public String toString() {
        return hdi.p("AutocompleteFilterObject(fieldName=", this.fieldName, ", value=", this.value, ")");
    }
}
