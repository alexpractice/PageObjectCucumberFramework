Feature: Проверка ЖКУ-Москва

Scenario: Проверка ЖКУ-Москва

Given открыта главная страница сайта
When выполнено нажатие на "Платежи"
Then страница ПЛАТЕЖИ загрузилась
When выполнено нажатие на "Коммунальные платежи"
Then страница Коммунальные платежи загрузилась
When установить город "Москва"
When запомнить первого провайдера
When выполнено нажатие на "Оплатить ЖКУ в Москве"
Then страница ЖКУ-МОСКВА загрузилась
When выполнено нажатие на "Оплатить ЖКУ"
Then страница ОПЛАТА ЖКУ загрузилась
When запомнить страницу оплаты
When выполнено нажатие на "Кнопка оплаты"
Then на экране "3" сообщения об ошибке c текстом "Поле обязательное"
When 1-ое поле заполняется значением "55555"
When выполнено нажатие на "Кнопка оплаты"
Then на экране есть текст "Поле неправильно заполнено"
When 1-ое поле очищено
When 1-ое поле заполняется значением "655jj55555"
When выполнено нажатие на "Кнопка оплаты"
Then на экране есть текст "Поле неправильно заполнено"
When 1-ое поле очищено
When 1-ое поле заполняется значением "1545646546"
Then на экране "0" сообщения об ошибке c текстом "Поле неправильно заполнено"
When 2-ое поле заполняется значением "0"
When выполнено нажатие на "Кнопка оплаты"
Then на экране есть текст "Поле заполнено некорректно"
When 2-ое поле заполняется значением "1"
When выполнено нажатие на "Кнопка оплаты"
Then на экране есть текст "Поле заполнено некорректно"
When 2-ое поле заполняется значением "1"
When выполнено нажатие на "Кнопка оплаты"
Then на экране есть текст "Поле заполнено некорректно"
When 2-ое поле очищено
When 2-ое поле заполняется значением "152013"
When выполнено нажатие на "Кнопка оплаты"
Then на экране есть текст "Поле заполнено некорректно"
When 2-ое поле очищено
When 2-ое поле заполняется значением "022015"
When выполнено нажатие на "Кнопка оплаты"
Then на экране "0" сообщения об ошибке c текстом "Поле заполнено некорректно"
When 4-ое поле заполняется значением "0"
When выполнено нажатие на "Кнопка оплаты"
Then на экране есть текст "Минимальная сумма перевода"
When 4-ое поле очищено
When 4-ое поле заполняется значением "1"
When выполнено нажатие на "Кнопка оплаты"
Then на экране есть текст "Минимальная сумма перевода"
When 4-ое поле очищено
When 4-ое поле заполняется значением "55000"
When выполнено нажатие на "Кнопка оплаты"
Then на экране есть текст "Максимальная сумма перевода"
When 4-ое поле очищено
When 4-ое поле заполняется значением "15"
When выполнено нажатие на "Кнопка оплаты"
Then на экране нет сообщений об ошибках
When выполнено нажатие на "Платежи"
Then страница ПЛАТЕЖИ загрузилась
When "поле поиска" заполняется сохранённым провайдером
Then сохранённый провайдер первый в списке
When выполнено нажатие для перехода к странице сохраненного провайдера
Then страница ЖКУ-МОСКВА загрузилась
When выполнено нажатие на "Оплатить ЖКУ"
Then страница ОПЛАТА ЖКУ загрузилась
Then странница оплаты та же, что и при переходе из меню
When выполнено нажатие на "Платежи"
Then страница ПЛАТЕЖИ загрузилась
When выполнено нажатие на "Коммунальные платежи"
Then страница Коммунальные платежи загрузилась
When установить город "Санкт-Петербург"
Then запомненный провайдер отсутствует в списке