package io.intercom.android.sdk.blocks.lib.models;

import io.intercom.android.sdk.models.carousel.Appearance;
import io.intercom.android.sdk.utilities.NullSafety;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class BlockMetadata {
    public static BlockMetadata NULL = new Builder().build();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        Appearance.Builder appearance;
        Boolean isFirstObject;
        Boolean isLastObject;

        public BlockMetadata build() {
            Appearance build;
            Appearance.Builder builder = this.appearance;
            if (builder == null) {
                build = Appearance.NULL;
            } else {
                build = builder.build();
            }
            return BlockMetadata.create(NullSafety.valueOrDefault(this.isFirstObject, false), NullSafety.valueOrDefault(this.isLastObject, false), build);
        }

        public Builder isFirstObject(Boolean bool) {
            this.isFirstObject = bool;
            return this;
        }

        public Builder isLastObject(Boolean bool) {
            this.isLastObject = bool;
            return this;
        }

        public Builder withAppearance(Appearance.Builder builder) {
            this.appearance = builder;
            return this;
        }
    }

    public static BlockMetadata create(boolean z, boolean z2, Appearance appearance) {
        return new AutoValue_BlockMetadata(z, z2, appearance);
    }

    public abstract Appearance getAppearance();

    public abstract boolean isFirstObject();

    public abstract boolean isLastObject();

    public boolean isSingleObject() {
        if (isFirstObject() && isLastObject()) {
            return true;
        }
        return false;
    }
}
