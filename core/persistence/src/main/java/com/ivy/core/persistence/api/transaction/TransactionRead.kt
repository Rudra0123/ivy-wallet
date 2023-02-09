package com.ivy.core.persistence.api.transaction

import com.ivy.core.data.Transaction
import com.ivy.core.data.TransactionId
import com.ivy.core.data.common.TimeRange
import com.ivy.core.persistence.api.ReadSyncable

interface TransactionRead : ReadSyncable<Transaction, TransactionId, TransactionQuery> {

}

sealed interface TransactionQuery {
    data class ForPeriod(
        val range: TimeRange,
        val actual: Boolean,
    ) : TransactionQuery
}