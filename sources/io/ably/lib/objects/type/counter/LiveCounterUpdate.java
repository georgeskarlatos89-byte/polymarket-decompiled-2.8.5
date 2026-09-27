package io.ably.lib.objects.type.counter;

import io.ably.lib.objects.type.ObjectUpdate;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public class LiveCounterUpdate extends ObjectUpdate {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes5.dex */
    public static class Update {
        private final Double amount;

        public Update(Double d) {
            this.amount = d;
        }

        public Double getAmount() {
            return this.amount;
        }
    }

    public LiveCounterUpdate(Double d) {
        super(new Update(d));
    }

    public Update getUpdate() {
        return (Update) this.update;
    }

    public String toString() {
        if (this.update == null) {
            return "LiveCounterUpdate{no change}";
        }
        return "LiveCounterUpdate{amount=" + getUpdate().getAmount() + "}";
    }

    public LiveCounterUpdate() {
        super(null);
    }
}
