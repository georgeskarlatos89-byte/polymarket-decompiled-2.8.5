package com.checkout.components.wallet.di;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class DaggerGooglePayComponent {
    public static Builder builder() {
        return new Builder(0);
    }

    public static GooglePayComponent create() {
        return new Builder(0).build();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private GooglePayModule a;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public final GooglePayComponent build() {
            GooglePayModule googlePayModule = this.a;
            if (googlePayModule == null) {
                googlePayModule = new GooglePayModule();
                this.a = googlePayModule;
            }
            return new a(googlePayModule);
        }

        public final Builder googlePayModule(GooglePayModule googlePayModule) {
            googlePayModule.getClass();
            this.a = googlePayModule;
            return this;
        }

        private Builder() {
        }
    }
}
