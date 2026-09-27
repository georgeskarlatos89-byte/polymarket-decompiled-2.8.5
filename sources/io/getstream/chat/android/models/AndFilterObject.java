package io.getstream.chat.android.models;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u001e\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÀ\u0001¢\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/getstream/chat/android/models/AndFilterObject;", "Lio/getstream/chat/android/models/FilterObject;", "filterObjects", "", "<init>", "(Ljava/util/Set;)V", "getFilterObjects", "()Ljava/util/Set;", "component1", "copy", "copy$stream_chat_android_core", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AndFilterObject extends FilterObject {
    private final Set<FilterObject> filterObjects;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndFilterObject(Set<? extends FilterObject> set) {
        super(null);
        set.getClass();
        this.filterObjects = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndFilterObject copy$stream_chat_android_core$default(AndFilterObject andFilterObject, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = andFilterObject.filterObjects;
        }
        return andFilterObject.copy$stream_chat_android_core(set);
    }

    public final Set<FilterObject> component1() {
        return this.filterObjects;
    }

    public final AndFilterObject copy$stream_chat_android_core(Set<? extends FilterObject> filterObjects) {
        filterObjects.getClass();
        return new AndFilterObject(filterObjects);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof AndFilterObject) && Intrinsics.areEqual(this.filterObjects, ((AndFilterObject) other).filterObjects)) {
            return true;
        }
        return false;
    }

    public final Set<FilterObject> getFilterObjects() {
        return this.filterObjects;
    }

    public int hashCode() {
        return this.filterObjects.hashCode();
    }

    public String toString() {
        return "AndFilterObject(filterObjects=" + this.filterObjects + ")";
    }
}
