# Generated by Django 2.1.7 on 2019-03-17 02:40

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('Notes', '0005_auto_20190317_0233'),
    ]

    operations = [
        migrations.AddField(
            model_name='classnote',
            name='note_slug',
            field=models.SlugField(null=True),
        ),
    ]