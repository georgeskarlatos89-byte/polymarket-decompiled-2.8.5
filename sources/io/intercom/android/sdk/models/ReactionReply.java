package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.utilities.commons.CollectionUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class ReactionReply implements Parcelable {
    private Integer reactionIndex;
    private final List<Reaction> reactionSet;
    public static final ReactionReply NULL = new ReactionReply(new Builder());
    public static final Parcelable.Creator<ReactionReply> CREATOR = new Parcelable.Creator<ReactionReply>() { // from class: io.intercom.android.sdk.models.ReactionReply.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReactionReply createFromParcel(Parcel parcel) {
            return new ReactionReply(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ReactionReply[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReactionReply[] newArray(int i) {
            return new ReactionReply[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ReactionReply createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    };

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static class Builder {
        Integer reaction_index;
        List<Reaction> reaction_set;

        public ReactionReply build() {
            return new ReactionReply(this);
        }
    }

    public ReactionReply(Parcel parcel) {
        Integer valueOf;
        if (parcel.readByte() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        this.reactionIndex = valueOf;
        ArrayList arrayList = new ArrayList();
        this.reactionSet = arrayList;
        parcel.readList(arrayList, Reaction.class.getClassLoader());
    }

    public static boolean isNull(ReactionReply reactionReply) {
        if (!NULL.equals(reactionReply) && reactionReply != null) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ReactionReply reactionReply = (ReactionReply) obj;
            if (!this.reactionSet.equals(reactionReply.reactionSet)) {
                return false;
            }
            Integer num = this.reactionIndex;
            Integer num2 = reactionReply.reactionIndex;
            if (num != null) {
                return num.equals(num2);
            }
            if (num2 == null) {
                return true;
            }
        }
        return false;
    }

    public Integer getReactionIndex() {
        return this.reactionIndex;
    }

    public List<Reaction> getReactionSet() {
        return this.reactionSet;
    }

    public int hashCode() {
        int i;
        int hashCode = this.reactionSet.hashCode() * 31;
        Integer num = this.reactionIndex;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public void setReactionIndex(int i) {
        this.reactionIndex = Integer.valueOf(i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.reactionIndex == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.reactionIndex.intValue());
        }
        parcel.writeList(this.reactionSet);
    }

    public ReactionReply(Builder builder) {
        this.reactionIndex = builder.reaction_index;
        ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(builder.reaction_set));
        this.reactionSet = arrayList;
        List<Reaction> list = builder.reaction_set;
        if (list != null) {
            arrayList.addAll(list);
        }
    }
}
