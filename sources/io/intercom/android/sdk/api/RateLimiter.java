package io.intercom.android.sdk.api;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
class RateLimiter {
    private final AppConfig appConfig;
    private int limitedRequestCount;
    private long periodStartTimestamp;
    private final TimeProvider timeProvider;
    private final Twig twig;

    public RateLimiter(AppConfig appConfig, TimeProvider timeProvider) {
        this.twig = LumberMill.getLogger();
        this.appConfig = appConfig;
        this.timeProvider = timeProvider;
    }

    private boolean hasReachedMaxCount() {
        if (this.limitedRequestCount >= this.appConfig.getRateLimitCount()) {
            return true;
        }
        return false;
    }

    private boolean isInsideCurrentTimePeriod() {
        if (this.timeProvider.currentTimeMillis() - this.periodStartTimestamp < this.appConfig.getRateLimitPeriodMs()) {
            return true;
        }
        return false;
    }

    public boolean isLimited() {
        if (isInsideCurrentTimePeriod() && hasReachedMaxCount()) {
            return true;
        }
        return false;
    }

    public void logError() {
        this.twig.e("Your app is being rate limited because you're performing too many requests per minute", new Object[0]);
    }

    public void recordRequest() {
        if (!isInsideCurrentTimePeriod()) {
            this.periodStartTimestamp = this.timeProvider.currentTimeMillis();
            this.limitedRequestCount = 0;
        }
        this.limitedRequestCount++;
    }

    public RateLimiter(AppConfig appConfig) {
        this(appConfig, TimeProvider.SYSTEM);
    }
}
