package io.intercom.android.sdk.blocks.lib.models;

import defpackage.dmk;
import io.intercom.android.sdk.models.carousel.Appearance;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
final class AutoValue_BlockMetadata extends BlockMetadata {
    private final Appearance appearance;
    private final boolean firstObject;
    private final boolean lastObject;

    public AutoValue_BlockMetadata(boolean z, boolean z2, Appearance appearance) {
        this.firstObject = z;
        this.lastObject = z2;
        if (appearance != null) {
            this.appearance = appearance;
        } else {
            dmk.s("Null appearance");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BlockMetadata) {
            BlockMetadata blockMetadata = (BlockMetadata) obj;
            if (this.firstObject == blockMetadata.isFirstObject() && this.lastObject == blockMetadata.isLastObject() && this.appearance.equals(blockMetadata.getAppearance())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.blocks.lib.models.BlockMetadata
    public Appearance getAppearance() {
        return this.appearance;
    }

    public int hashCode() {
        int i;
        int i2 = 1237;
        if (this.firstObject) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (i ^ 1000003) * 1000003;
        if (this.lastObject) {
            i2 = 1231;
        }
        return this.appearance.hashCode() ^ ((i3 ^ i2) * 1000003);
    }

    @Override // io.intercom.android.sdk.blocks.lib.models.BlockMetadata
    public boolean isFirstObject() {
        return this.firstObject;
    }

    @Override // io.intercom.android.sdk.blocks.lib.models.BlockMetadata
    public boolean isLastObject() {
        return this.lastObject;
    }

    public String toString() {
        return "BlockMetadata{firstObject=" + this.firstObject + ", lastObject=" + this.lastObject + ", appearance=" + this.appearance + "}";
    }
}
