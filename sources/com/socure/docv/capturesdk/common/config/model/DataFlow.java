package com.socure.docv.capturesdk.common.config.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.socure.docv.capturesdk.common.utils.Screen;
import defpackage.woa;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/socure/docv/capturesdk/common/config/model/DataFlow;", "Landroid/os/Parcelable;", "screenSequence", "Ljava/util/ArrayList;", "Lcom/socure/docv/capturesdk/common/utils/Screen;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getScreenSequence", "()Ljava/util/ArrayList;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DataFlow implements Parcelable {
    private final ArrayList<Screen> screenSequence;
    public static final Parcelable.Creator<DataFlow> CREATOR = new Creator();
    public static final int $stable = 8;

    public DataFlow(ArrayList<Screen> arrayList) {
        arrayList.getClass();
        this.screenSequence = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataFlow copy$default(DataFlow dataFlow, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = dataFlow.screenSequence;
        }
        return dataFlow.copy(arrayList);
    }

    public final ArrayList<Screen> component1() {
        return this.screenSequence;
    }

    public final DataFlow copy(ArrayList<Screen> screenSequence) {
        screenSequence.getClass();
        return new DataFlow(screenSequence);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if ((other instanceof DataFlow) && Intrinsics.areEqual(this.screenSequence, ((DataFlow) other).screenSequence)) {
            return true;
        }
        return false;
    }

    public final ArrayList<Screen> getScreenSequence() {
        return this.screenSequence;
    }

    public int hashCode() {
        return this.screenSequence.hashCode();
    }

    public String toString() {
        return "DataFlow(screenSequence=" + this.screenSequence + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        ArrayList<Screen> arrayList = this.screenSequence;
        dest.writeInt(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Screen screen = arrayList.get(i);
            i++;
            screen.writeToParcel(dest, flags);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<DataFlow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataFlow createFromParcel(Parcel parcel) {
            parcel.getClass();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = woa.e(Screen.CREATOR, parcel, arrayList, i, 1);
            }
            return new DataFlow(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DataFlow[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataFlow[] newArray(int i) {
            return new DataFlow[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DataFlow createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    }
}
